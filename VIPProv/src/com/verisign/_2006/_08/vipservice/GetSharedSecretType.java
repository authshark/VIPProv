
package com.verisign._2006._08.vipservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Type for a shared-secret provisioning request. TokenId is part of the request except for a server-generated token-id where only the prefix is included in the request. OtpAlgorithm indicates the algorithm supported by the token-device. SharedSecretDeliveryMethod specifies the mechanism to be used for delivering the shared-secret e.g. via https or sms. SupportedEncryptionAlgorithm indicates the algorithm that the service should use to encrypt the shared-secret. The inherited optional element Signature may contain the signature over the TokenId or the TokenModel element of the request depending upon the capabilities of the device and the presence of a device certificate.
 *         		
 * 
 * <p>Java class for GetSharedSecretType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSharedSecretType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}RequestAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}TokenModel"/>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}ActivationCode"/>
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtpAlgorithm" type="{http://www.verisign.com/2006/08/vipservice}OtpAlgorithmIdentifierType" maxOccurs="5"/>
 *         &lt;element name="ClockDrift" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}SharedSecretDeliveryMethod" minOccurs="0"/>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}SupportedEncryptionAlgorithm" minOccurs="0"/>
 *         &lt;element name="DeviceId" type="{http://www.verisign.com/2006/08/vipservice}DeviceIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharedSecretType", propOrder = {
    "tokenModel",
    "activationCode",
    "pin",
    "otpAlgorithm",
    "clockDrift",
    "sharedSecretDeliveryMethod",
    "supportedEncryptionAlgorithm",
    "deviceId"
})
public class GetSharedSecretType
    extends RequestAbstractType
{

    @XmlElement(name = "TokenModel", required = true)
    protected String tokenModel;
    @XmlElement(name = "ActivationCode", required = true)
    protected String activationCode;
    @XmlElement(name = "Pin")
    protected String pin;
    @XmlElement(name = "OtpAlgorithm", required = true)
    protected List<OtpAlgorithmIdentifierType> otpAlgorithm;
    @XmlElement(name = "ClockDrift")
    protected Integer clockDrift;
    @XmlElement(name = "SharedSecretDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected SharedSecretDeliveryMethodType sharedSecretDeliveryMethod;
    @XmlElement(name = "SupportedEncryptionAlgorithm")
    @XmlSchemaType(name = "string")
    protected EncryptionAlgorithmType supportedEncryptionAlgorithm;
    @XmlElement(name = "DeviceId")
    protected DeviceIdType deviceId;

    /**
     * Gets the value of the tokenModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenModel() {
        return tokenModel;
    }

    /**
     * Sets the value of the tokenModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenModel(String value) {
        this.tokenModel = value;
    }

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the otpAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otpAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtpAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtpAlgorithmIdentifierType }
     * 
     * 
     */
    public List<OtpAlgorithmIdentifierType> getOtpAlgorithm() {
        if (otpAlgorithm == null) {
            otpAlgorithm = new ArrayList<OtpAlgorithmIdentifierType>();
        }
        return this.otpAlgorithm;
    }

    /**
     * Gets the value of the clockDrift property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClockDrift() {
        return clockDrift;
    }

    /**
     * Sets the value of the clockDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClockDrift(Integer value) {
        this.clockDrift = value;
    }

    /**
     * Gets the value of the sharedSecretDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SharedSecretDeliveryMethodType }
     *     
     */
    public SharedSecretDeliveryMethodType getSharedSecretDeliveryMethod() {
        return sharedSecretDeliveryMethod;
    }

    /**
     * Sets the value of the sharedSecretDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedSecretDeliveryMethodType }
     *     
     */
    public void setSharedSecretDeliveryMethod(SharedSecretDeliveryMethodType value) {
        this.sharedSecretDeliveryMethod = value;
    }

    /**
     * Gets the value of the supportedEncryptionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionAlgorithmType }
     *     
     */
    public EncryptionAlgorithmType getSupportedEncryptionAlgorithm() {
        return supportedEncryptionAlgorithm;
    }

    /**
     * Sets the value of the supportedEncryptionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionAlgorithmType }
     *     
     */
    public void setSupportedEncryptionAlgorithm(EncryptionAlgorithmType value) {
        this.supportedEncryptionAlgorithm = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdType }
     *     
     */
    public DeviceIdType getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdType }
     *     
     */
    public void setDeviceId(DeviceIdType value) {
        this.deviceId = value;
    }

}
