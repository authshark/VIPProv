
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Response for a request to get acivation code status and token-id.
 *         		
 * 
 * <p>Java class for GetACStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetACStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}ResponseWithStatusType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}TokenId" minOccurs="0"/>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}ActivationCodeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetACStatusResponseType", propOrder = {
    "tokenId",
    "activationCodeStatus"
})
public class GetACStatusResponseType
    extends ResponseWithStatusType
{

    @XmlElement(name = "TokenId")
    protected TokenIdType tokenId;
    @XmlElement(name = "ActivationCodeStatus")
    @XmlSchemaType(name = "string")
    protected ActivationCodeStatusType activationCodeStatus;

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link TokenIdType }
     *     
     */
    public TokenIdType getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenIdType }
     *     
     */
    public void setTokenId(TokenIdType value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the activationCodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationCodeStatusType }
     *     
     */
    public ActivationCodeStatusType getActivationCodeStatus() {
        return activationCodeStatus;
    }

    /**
     * Sets the value of the activationCodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationCodeStatusType }
     *     
     */
    public void setActivationCodeStatus(ActivationCodeStatusType value) {
        this.activationCodeStatus = value;
    }

}
