
package com.verisign._2006._08.vipservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.verisign._2006._08.vipservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetServerTime_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetServerTime");
    private final static QName _GetOrderStatus_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetOrderStatus");
    private final static QName _GetServerTimeResponse_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeResponse");
    private final static QName _GetActivationCode_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetActivationCode");
    private final static QName _TokenModel_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "TokenModel");
    private final static QName _Reason_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "Reason");
    private final static QName _GetSharedSecretResponse_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetSharedSecretResponse");
    private final static QName _Adapter_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "Adapter");
    private final static QName _AdapterInfoSMSOTP_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "AdapterInfoSMSOTP");
    private final static QName _AdapterInfoEventBased_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "AdapterInfoEventBased");
    private final static QName _RequestCode_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "RequestCode");
    private final static QName _TokenStatusCount_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "TokenStatusCount");
    private final static QName _TokenId_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "TokenId");
    private final static QName _ActivationCode_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "ActivationCode");
    private final static QName _GetACStatusResponse_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetACStatusResponse");
    private final static QName _SharedSecretDeliveryMethod_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "SharedSecretDeliveryMethod");
    private final static QName _TokenStatus_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "TokenStatus");
    private final static QName _EncryptionAlgorithm_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "EncryptionAlgorithm");
    private final static QName _ActivationCodeStatus_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "ActivationCodeStatus");
    private final static QName _GetSharedSecret_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetSharedSecret");
    private final static QName _GetACStatus_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetACStatus");
    private final static QName _ReasonCode_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "ReasonCode");
    private final static QName _TokenCategory_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "TokenCategory");
    private final static QName _ErrorResponse_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "ErrorResponse");
    private final static QName _AccountInformation_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "AccountInformation");
    private final static QName _GetOrderStatusResponse_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetOrderStatusResponse");
    private final static QName _NetworkIntelligence_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "NetworkIntelligence");
    private final static QName _TokenInformation_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "TokenInformation");
    private final static QName _AdapterInfoServerOTP_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "AdapterInfoServerOTP");
    private final static QName _IssuerLogo_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "IssuerLogo");
    private final static QName _SupportedEncryptionAlgorithm_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "SupportedEncryptionAlgorithm");
    private final static QName _SecretContainer_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "SecretContainer");
    private final static QName _ACProfile_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "ACProfile");
    private final static QName _AdapterInfoTimeBased_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "AdapterInfoTimeBased");
    private final static QName _Key_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "Key");
    private final static QName _FeatureList_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "FeatureList");
    private final static QName _AdapterInfoHOTPTimeBased_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "AdapterInfoHOTPTimeBased");
    private final static QName _GetActivationCodeResponse_QNAME = new QName("http://www.verisign.com/2006/08/vipservice", "GetActivationCodeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.verisign._2006._08.vipservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NetworkIntelligenceType }
     * 
     */
    public NetworkIntelligenceType createNetworkIntelligenceType() {
        return new NetworkIntelligenceType();
    }

    /**
     * Create an instance of {@link NetworkIntelligenceType.TokenState }
     * 
     */
    public NetworkIntelligenceType.TokenState createNetworkIntelligenceTypeTokenState() {
        return new NetworkIntelligenceType.TokenState();
    }

    /**
     * Create an instance of {@link AdapterInfoSMSOTPType }
     * 
     */
    public AdapterInfoSMSOTPType createAdapterInfoSMSOTPType() {
        return new AdapterInfoSMSOTPType();
    }

    /**
     * Create an instance of {@link GetServerTimeType }
     * 
     */
    public GetServerTimeType createGetServerTimeType() {
        return new GetServerTimeType();
    }

    /**
     * Create an instance of {@link GetOrderStatusType }
     * 
     */
    public GetOrderStatusType createGetOrderStatusType() {
        return new GetOrderStatusType();
    }

    /**
     * Create an instance of {@link GetServerTimeResponseType }
     * 
     */
    public GetServerTimeResponseType createGetServerTimeResponseType() {
        return new GetServerTimeResponseType();
    }

    /**
     * Create an instance of {@link GetActivationCodeType }
     * 
     */
    public GetActivationCodeType createGetActivationCodeType() {
        return new GetActivationCodeType();
    }

    /**
     * Create an instance of {@link GetSharedSecretResponseType }
     * 
     */
    public GetSharedSecretResponseType createGetSharedSecretResponseType() {
        return new GetSharedSecretResponseType();
    }

    /**
     * Create an instance of {@link AdapterInfoEventBasedType }
     * 
     */
    public AdapterInfoEventBasedType createAdapterInfoEventBasedType() {
        return new AdapterInfoEventBasedType();
    }

    /**
     * Create an instance of {@link TokenStatusCountType }
     * 
     */
    public TokenStatusCountType createTokenStatusCountType() {
        return new TokenStatusCountType();
    }

    /**
     * Create an instance of {@link TokenIdType }
     * 
     */
    public TokenIdType createTokenIdType() {
        return new TokenIdType();
    }

    /**
     * Create an instance of {@link GetACStatusResponseType }
     * 
     */
    public GetACStatusResponseType createGetACStatusResponseType() {
        return new GetACStatusResponseType();
    }

    /**
     * Create an instance of {@link GetACStatusType }
     * 
     */
    public GetACStatusType createGetACStatusType() {
        return new GetACStatusType();
    }

    /**
     * Create an instance of {@link GetSharedSecretType }
     * 
     */
    public GetSharedSecretType createGetSharedSecretType() {
        return new GetSharedSecretType();
    }

    /**
     * Create an instance of {@link TokenInformationType }
     * 
     */
    public TokenInformationType createTokenInformationType() {
        return new TokenInformationType();
    }

    /**
     * Create an instance of {@link AdapterInfoServerOTPType }
     * 
     */
    public AdapterInfoServerOTPType createAdapterInfoServerOTPType() {
        return new AdapterInfoServerOTPType();
    }

    /**
     * Create an instance of {@link ResponseWithStatusType }
     * 
     */
    public ResponseWithStatusType createResponseWithStatusType() {
        return new ResponseWithStatusType();
    }

    /**
     * Create an instance of {@link AccountInformationType }
     * 
     */
    public AccountInformationType createAccountInformationType() {
        return new AccountInformationType();
    }

    /**
     * Create an instance of {@link GetOrderStatusResponseType }
     * 
     */
    public GetOrderStatusResponseType createGetOrderStatusResponseType() {
        return new GetOrderStatusResponseType();
    }

    /**
     * Create an instance of {@link SecretContainerType }
     * 
     */
    public SecretContainerType createSecretContainerType() {
        return new SecretContainerType();
    }

    /**
     * Create an instance of {@link LogoType }
     * 
     */
    public LogoType createLogoType() {
        return new LogoType();
    }

    /**
     * Create an instance of {@link FeatureListType }
     * 
     */
    public FeatureListType createFeatureListType() {
        return new FeatureListType();
    }

    /**
     * Create an instance of {@link AdapterInfoHOTPTimeBasedType }
     * 
     */
    public AdapterInfoHOTPTimeBasedType createAdapterInfoHOTPTimeBasedType() {
        return new AdapterInfoHOTPTimeBasedType();
    }

    /**
     * Create an instance of {@link GetActivationCodeResponseType }
     * 
     */
    public GetActivationCodeResponseType createGetActivationCodeResponseType() {
        return new GetActivationCodeResponseType();
    }

    /**
     * Create an instance of {@link AdapterInfoTimeBasedType }
     * 
     */
    public AdapterInfoTimeBasedType createAdapterInfoTimeBasedType() {
        return new AdapterInfoTimeBasedType();
    }

    /**
     * Create an instance of {@link OtpAlgorithmIdentifierType }
     * 
     */
    public OtpAlgorithmIdentifierType createOtpAlgorithmIdentifierType() {
        return new OtpAlgorithmIdentifierType();
    }

    /**
     * Create an instance of {@link GatewayAcctInfoType }
     * 
     */
    public GatewayAcctInfoType createGatewayAcctInfoType() {
        return new GatewayAcctInfoType();
    }

    /**
     * Create an instance of {@link SMSDeliveryInfoType }
     * 
     */
    public SMSDeliveryInfoType createSMSDeliveryInfoType() {
        return new SMSDeliveryInfoType();
    }

    /**
     * Create an instance of {@link EncryptionMethodType }
     * 
     */
    public EncryptionMethodType createEncryptionMethodType() {
        return new EncryptionMethodType();
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     */
    public DeviceType createDeviceType() {
        return new DeviceType();
    }

    /**
     * Create an instance of {@link OTPIndexType }
     * 
     */
    public OTPIndexType createOTPIndexType() {
        return new OTPIndexType();
    }

    /**
     * Create an instance of {@link BrandInfoType }
     * 
     */
    public BrandInfoType createBrandInfoType() {
        return new BrandInfoType();
    }

    /**
     * Create an instance of {@link UsageType }
     * 
     */
    public UsageType createUsageType() {
        return new UsageType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link SecretType }
     * 
     */
    public SecretType createSecretType() {
        return new SecretType();
    }

    /**
     * Create an instance of {@link DeviceIdType }
     * 
     */
    public DeviceIdType createDeviceIdType() {
        return new DeviceIdType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link DigestType }
     * 
     */
    public DigestType createDigestType() {
        return new DigestType();
    }

    /**
     * Create an instance of {@link NetworkIntelligenceType.TokenState.Reason }
     * 
     */
    public NetworkIntelligenceType.TokenState.Reason createNetworkIntelligenceTypeTokenStateReason() {
        return new NetworkIntelligenceType.TokenState.Reason();
    }

    /**
     * Create an instance of {@link AdapterInfoSMSOTPType.Message }
     * 
     */
    public AdapterInfoSMSOTPType.Message createAdapterInfoSMSOTPTypeMessage() {
        return new AdapterInfoSMSOTPType.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetServerTime")
    public JAXBElement<GetServerTimeType> createGetServerTime(GetServerTimeType value) {
        return new JAXBElement<GetServerTimeType>(_GetServerTime_QNAME, GetServerTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetOrderStatus")
    public JAXBElement<GetOrderStatusType> createGetOrderStatus(GetOrderStatusType value) {
        return new JAXBElement<GetOrderStatusType>(_GetOrderStatus_QNAME, GetOrderStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetServerTimeResponse")
    public JAXBElement<GetServerTimeResponseType> createGetServerTimeResponse(GetServerTimeResponseType value) {
        return new JAXBElement<GetServerTimeResponseType>(_GetServerTimeResponse_QNAME, GetServerTimeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetActivationCode")
    public JAXBElement<GetActivationCodeType> createGetActivationCode(GetActivationCodeType value) {
        return new JAXBElement<GetActivationCodeType>(_GetActivationCode_QNAME, GetActivationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "TokenModel")
    public JAXBElement<String> createTokenModel(String value) {
        return new JAXBElement<String>(_TokenModel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "Reason")
    public JAXBElement<ReasonType> createReason(ReasonType value) {
        return new JAXBElement<ReasonType>(_Reason_QNAME, ReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedSecretResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetSharedSecretResponse")
    public JAXBElement<GetSharedSecretResponseType> createGetSharedSecretResponse(GetSharedSecretResponseType value) {
        return new JAXBElement<GetSharedSecretResponseType>(_GetSharedSecretResponse_QNAME, GetSharedSecretResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdapterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "Adapter")
    public JAXBElement<AdapterType> createAdapter(AdapterType value) {
        return new JAXBElement<AdapterType>(_Adapter_QNAME, AdapterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdapterInfoSMSOTPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "AdapterInfoSMSOTP")
    public JAXBElement<AdapterInfoSMSOTPType> createAdapterInfoSMSOTP(AdapterInfoSMSOTPType value) {
        return new JAXBElement<AdapterInfoSMSOTPType>(_AdapterInfoSMSOTP_QNAME, AdapterInfoSMSOTPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdapterInfoEventBasedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "AdapterInfoEventBased")
    public JAXBElement<AdapterInfoEventBasedType> createAdapterInfoEventBased(AdapterInfoEventBasedType value) {
        return new JAXBElement<AdapterInfoEventBasedType>(_AdapterInfoEventBased_QNAME, AdapterInfoEventBasedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "RequestCode")
    public JAXBElement<String> createRequestCode(String value) {
        return new JAXBElement<String>(_RequestCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenStatusCountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "TokenStatusCount")
    public JAXBElement<TokenStatusCountType> createTokenStatusCount(TokenStatusCountType value) {
        return new JAXBElement<TokenStatusCountType>(_TokenStatusCount_QNAME, TokenStatusCountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "TokenId")
    public JAXBElement<TokenIdType> createTokenId(TokenIdType value) {
        return new JAXBElement<TokenIdType>(_TokenId_QNAME, TokenIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "ActivationCode")
    public JAXBElement<String> createActivationCode(String value) {
        return new JAXBElement<String>(_ActivationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetACStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetACStatusResponse")
    public JAXBElement<GetACStatusResponseType> createGetACStatusResponse(GetACStatusResponseType value) {
        return new JAXBElement<GetACStatusResponseType>(_GetACStatusResponse_QNAME, GetACStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedSecretDeliveryMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "SharedSecretDeliveryMethod")
    public JAXBElement<SharedSecretDeliveryMethodType> createSharedSecretDeliveryMethod(SharedSecretDeliveryMethodType value) {
        return new JAXBElement<SharedSecretDeliveryMethodType>(_SharedSecretDeliveryMethod_QNAME, SharedSecretDeliveryMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "TokenStatus")
    public JAXBElement<TokenStatusType> createTokenStatus(TokenStatusType value) {
        return new JAXBElement<TokenStatusType>(_TokenStatus_QNAME, TokenStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionAlgorithmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "EncryptionAlgorithm")
    public JAXBElement<EncryptionAlgorithmType> createEncryptionAlgorithm(EncryptionAlgorithmType value) {
        return new JAXBElement<EncryptionAlgorithmType>(_EncryptionAlgorithm_QNAME, EncryptionAlgorithmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivationCodeStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "ActivationCodeStatus")
    public JAXBElement<ActivationCodeStatusType> createActivationCodeStatus(ActivationCodeStatusType value) {
        return new JAXBElement<ActivationCodeStatusType>(_ActivationCodeStatus_QNAME, ActivationCodeStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedSecretType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetSharedSecret")
    public JAXBElement<GetSharedSecretType> createGetSharedSecret(GetSharedSecretType value) {
        return new JAXBElement<GetSharedSecretType>(_GetSharedSecret_QNAME, GetSharedSecretType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetACStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetACStatus")
    public JAXBElement<GetACStatusType> createGetACStatus(GetACStatusType value) {
        return new JAXBElement<GetACStatusType>(_GetACStatus_QNAME, GetACStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "ReasonCode")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createReasonCode(byte[] value) {
        return new JAXBElement<byte[]>(_ReasonCode_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "TokenCategory")
    public JAXBElement<TokenCategoryType> createTokenCategory(TokenCategoryType value) {
        return new JAXBElement<TokenCategoryType>(_TokenCategory_QNAME, TokenCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseWithStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "ErrorResponse")
    public JAXBElement<ResponseWithStatusType> createErrorResponse(ResponseWithStatusType value) {
        return new JAXBElement<ResponseWithStatusType>(_ErrorResponse_QNAME, ResponseWithStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "AccountInformation")
    public JAXBElement<AccountInformationType> createAccountInformation(AccountInformationType value) {
        return new JAXBElement<AccountInformationType>(_AccountInformation_QNAME, AccountInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetOrderStatusResponse")
    public JAXBElement<GetOrderStatusResponseType> createGetOrderStatusResponse(GetOrderStatusResponseType value) {
        return new JAXBElement<GetOrderStatusResponseType>(_GetOrderStatusResponse_QNAME, GetOrderStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkIntelligenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "NetworkIntelligence")
    public JAXBElement<NetworkIntelligenceType> createNetworkIntelligence(NetworkIntelligenceType value) {
        return new JAXBElement<NetworkIntelligenceType>(_NetworkIntelligence_QNAME, NetworkIntelligenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "TokenInformation")
    public JAXBElement<TokenInformationType> createTokenInformation(TokenInformationType value) {
        return new JAXBElement<TokenInformationType>(_TokenInformation_QNAME, TokenInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdapterInfoServerOTPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "AdapterInfoServerOTP")
    public JAXBElement<AdapterInfoServerOTPType> createAdapterInfoServerOTP(AdapterInfoServerOTPType value) {
        return new JAXBElement<AdapterInfoServerOTPType>(_AdapterInfoServerOTP_QNAME, AdapterInfoServerOTPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "IssuerLogo")
    public JAXBElement<LogoType> createIssuerLogo(LogoType value) {
        return new JAXBElement<LogoType>(_IssuerLogo_QNAME, LogoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionAlgorithmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "SupportedEncryptionAlgorithm")
    public JAXBElement<EncryptionAlgorithmType> createSupportedEncryptionAlgorithm(EncryptionAlgorithmType value) {
        return new JAXBElement<EncryptionAlgorithmType>(_SupportedEncryptionAlgorithm_QNAME, EncryptionAlgorithmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecretContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "SecretContainer")
    public JAXBElement<SecretContainerType> createSecretContainer(SecretContainerType value) {
        return new JAXBElement<SecretContainerType>(_SecretContainer_QNAME, SecretContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "ACProfile")
    public JAXBElement<ACProfileType> createACProfile(ACProfileType value) {
        return new JAXBElement<ACProfileType>(_ACProfile_QNAME, ACProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdapterInfoTimeBasedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "AdapterInfoTimeBased")
    public JAXBElement<AdapterInfoTimeBasedType> createAdapterInfoTimeBased(AdapterInfoTimeBasedType value) {
        return new JAXBElement<AdapterInfoTimeBasedType>(_AdapterInfoTimeBased_QNAME, AdapterInfoTimeBasedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "Key")
    public JAXBElement<String> createKey(String value) {
        return new JAXBElement<String>(_Key_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "FeatureList")
    public JAXBElement<FeatureListType> createFeatureList(FeatureListType value) {
        return new JAXBElement<FeatureListType>(_FeatureList_QNAME, FeatureListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdapterInfoHOTPTimeBasedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "AdapterInfoHOTPTimeBased")
    public JAXBElement<AdapterInfoHOTPTimeBasedType> createAdapterInfoHOTPTimeBased(AdapterInfoHOTPTimeBasedType value) {
        return new JAXBElement<AdapterInfoHOTPTimeBasedType>(_AdapterInfoHOTPTimeBased_QNAME, AdapterInfoHOTPTimeBasedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivationCodeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.verisign.com/2006/08/vipservice", name = "GetActivationCodeResponse")
    public JAXBElement<GetActivationCodeResponseType> createGetActivationCodeResponse(GetActivationCodeResponseType value) {
        return new JAXBElement<GetActivationCodeResponseType>(_GetActivationCodeResponse_QNAME, GetActivationCodeResponseType.class, null, value);
    }

}
