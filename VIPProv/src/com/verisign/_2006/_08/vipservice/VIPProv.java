package com.verisign._2006._08.vipservice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class VIPProv {
       
       static VipSoapInterfaceService VIPService;
       static VipSoapInterface VIPServiceInterface;
       
       static void initVIPService() {
              String pathToP12File = "C:\\alin\\VIP_Certs\\Prod_Alin\\vip_cert.p12";
              String password = "Password1";
              System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
              System.setProperty("javax.net.ssl.keyStore", pathToP12File);
              System.setProperty("javax.net.ssl.keyStorePassword", password);
              
              VIPService = new VipSoapInterfaceService();
              VIPServiceInterface = VIPService.getVipServiceAPI();
       }
       
       private static String DecodeAndWriteSecret(EncryptionMethodType EncryptionMethod, DataType EncryptedSecret, String Password, String CredentialId) {
              Path path = Paths.get(CredentialId + ".tok");
              SecretKey Key =  null;
              Cipher C = null;
              
              // build the 128 bit key from the password, salt and iteration count received from VIP
              try {
                     
                     SecretKeyFactory KeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                     KeySpec KeySpec = new PBEKeySpec(Password.toCharArray(), 
                                  EncryptionMethod.getPBESalt(), 
                                  EncryptionMethod.getPBEIterationCount().intValue(),
                                  128);        
                     SecretKey TmpKey = KeyFactory.generateSecret(KeySpec);
                     
                     //associate the AES algorithm to the key for PBE-AES128 encryption
                     Key = new SecretKeySpec(TmpKey.getEncoded(), "AES");

              } catch (NoSuchAlgorithmException | InvalidKeySpecException e1) {
                     e1.printStackTrace();
              }
              
              // construct the cipher object from the key and IV in decryption mode
              try {
                     C = Cipher.getInstance("AES/CBC/PKCS5Padding");      
                     C.init(Cipher.DECRYPT_MODE, 
                                  Key, 
                                  new IvParameterSpec(EncryptionMethod.getIV()));
                  
              } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException e1) {
                     e1.printStackTrace();
              }
              
              
              try {
                     Files.write(path, C.doFinal(EncryptedSecret.getCipher())); //creates, overwrites
              } catch (IOException | IllegalBlockSizeException | BadPaddingException e) {
                     e.printStackTrace();
              }
              
              return ("File " + CredentialId + ".tok has been saved in the local folder." );
       }
       
       public static String GetVIPTime(){
              GetServerTimeType VIPTimeType = new GetServerTimeType();
              VIPTimeType.setId("rqstId" + System.currentTimeMillis());
              VIPTimeType.setVersion("1.0");
              
              try {
                     GetServerTimeResponseType VIPTimeResponse = VIPServiceInterface.getServerTime(VIPTimeType);
                     return VIPTimeResponse.getTimestamp().toString();
              }
              catch (Exception e) {
                     e.printStackTrace();
              }
              
              return "There was an Error in getVIPTime()!";
       }
       
       private static String GetVIPAuthenticator(String VIPActivationCode) {

              GetSharedSecretType VIPSecretType = new GetSharedSecretType();
              
              OtpAlgorithmIdentifierType AlgType = new OtpAlgorithmIdentifierType();
              AlgType.setType("HMAC-SHA1-TRUNC-6DIGITS");
              
              VIPSecretType.setId("rqstId" + System.currentTimeMillis());
              VIPSecretType.setVersion("1.0");
              VIPSecretType.setTokenModel("VSME");
              VIPSecretType.setActivationCode(VIPActivationCode);
              VIPSecretType.getOtpAlgorithm().add(AlgType);
              
              try {
                     GetSharedSecretResponseType VIPSecretResponse = VIPServiceInterface.getSharedSecret(VIPSecretType);
                     return DecodeAndWriteSecret(VIPSecretResponse.getSecretContainer().getEncryptionMethod(),
                                                                            VIPSecretResponse.getSecretContainer().getDevice().get(0).getSecret().getData(),
                                                                           VIPActivationCode,
                                                                            VIPSecretResponse.getSecretContainer().getDevice().get(0).getSecret().getId());
              } catch (Exception e) {
                     e.printStackTrace();
              }
              
              return "There was an Error in getVIPAuthenticator()!";
       }
       
       public static String getVIPAC(){
              GetActivationCodeType VIPACType = new GetActivationCodeType();
              
              VIPACType.setId("rqstId" + System.currentTimeMillis());
              VIPACType.setVersion("1.0");
              VIPACType.setACProfile(ACProfileType.MOBILEPHONE);
              
              try {
                     GetActivationCodeResponseType VIPACResponse = VIPServiceInterface.getActivationCode(VIPACType);
                     return VIPACResponse.getActivationCode();
              }
              catch (Exception e) {
                     e.printStackTrace();
              }
              
              return "There was an Error in getVIPAC()!";
       }
       
       public static void main(String[] args) {

              initVIPService();
              
              //Get the VIP Service time and display it in the console
              System.out.println("VIP Time: " + GetVIPTime());
              
              //Get a VIP authenticator, decrypt and save the un-encrypted seed in a .tok file with the CredentialID as the filename
              System.out.println(GetVIPAuthenticator(getVIPAC()));
       }

}
