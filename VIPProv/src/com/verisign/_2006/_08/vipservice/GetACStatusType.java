
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Request sent by issuer to get the status of an activation code. Optionally a token-id is returned in the response if this activation code is already associated with a token.
 *             		The same request is also used during first time otp validation at the issuer site when the issuer only has the activation code not the token-id.
 *        		
 * 
 * <p>Java class for GetACStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetACStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}AccountRequestAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}ActivationCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetACStatusType", propOrder = {
    "activationCode"
})
public class GetACStatusType
    extends AccountRequestAbstractType
{

    @XmlElement(name = "ActivationCode", required = true)
    protected String activationCode;

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

}
