
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		class for all request messages that have token id
 *         		
 * 
 * <p>Java class for TokenRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}AccountRequestAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}TokenId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenRequestType", propOrder = {
    "tokenId"
})
public abstract class TokenRequestType
    extends AccountRequestAbstractType
{

    @XmlElement(name = "TokenId", required = true)
    protected TokenIdType tokenId;

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

}
