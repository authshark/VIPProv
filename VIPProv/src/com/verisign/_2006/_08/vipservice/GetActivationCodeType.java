
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Request to Get Activation Code from an Issuer. Includes an ACProfile that indicates the length and character-set of the requested activation code.
 *         		
 * 
 * <p>Java class for GetActivationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActivationCodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}AccountRequestAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}ACProfile"/>
 *         &lt;element name="OrderProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActivationCodeType", propOrder = {
    "acProfile",
    "orderProfileId"
})
public class GetActivationCodeType
    extends AccountRequestAbstractType
{

    @XmlElement(name = "ACProfile", required = true)
    @XmlSchemaType(name = "string")
    protected ACProfileType acProfile;
    @XmlElement(name = "OrderProfileId")
    protected String orderProfileId;

    /**
     * Gets the value of the acProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ACProfileType }
     *     
     */
    public ACProfileType getACProfile() {
        return acProfile;
    }

    /**
     * Sets the value of the acProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACProfileType }
     *     
     */
    public void setACProfile(ACProfileType value) {
        this.acProfile = value;
    }

    /**
     * Gets the value of the orderProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderProfileId() {
        return orderProfileId;
    }

    /**
     * Sets the value of the orderProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderProfileId(String value) {
        this.orderProfileId = value;
    }

}
