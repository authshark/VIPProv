
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Type for a shared-secret provisioning response. SharedSecretDeliveryMechanism specifies the mechanism being used for delivering the shared-secret e.g. via https or sms.
 *         		
 * 
 * <p>Java class for GetSharedSecretResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSharedSecretResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}ResponseWithStatusType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}SharedSecretDeliveryMethod" minOccurs="0"/>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}SecretContainer" minOccurs="0"/>
 *         &lt;element name="UTCTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharedSecretResponseType", propOrder = {
    "sharedSecretDeliveryMethod",
    "secretContainer",
    "utcTimestamp"
})
public class GetSharedSecretResponseType
    extends ResponseWithStatusType
{

    @XmlElement(name = "SharedSecretDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected SharedSecretDeliveryMethodType sharedSecretDeliveryMethod;
    @XmlElement(name = "SecretContainer")
    protected SecretContainerType secretContainer;
    @XmlElement(name = "UTCTimestamp")
    protected String utcTimestamp;

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
     * Gets the value of the secretContainer property.
     * 
     * @return
     *     possible object is
     *     {@link SecretContainerType }
     *     
     */
    public SecretContainerType getSecretContainer() {
        return secretContainer;
    }

    /**
     * Sets the value of the secretContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecretContainerType }
     *     
     */
    public void setSecretContainer(SecretContainerType value) {
        this.secretContainer = value;
    }

    /**
     * Gets the value of the utcTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTCTimestamp() {
        return utcTimestamp;
    }

    /**
     * Sets the value of the utcTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTCTimestamp(String value) {
        this.utcTimestamp = value;
    }

}
