
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *             		Response to a request to get activation code. A successful response contains the activation code and its expiry date-time.
 *         		
 * 
 * <p>Java class for GetActivationCodeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActivationCodeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}ResponseWithStatusType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}ActivationCode" minOccurs="0"/>
 *         &lt;element name="ACExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActivationCodeResponseType", propOrder = {
    "activationCode",
    "acExpiry"
})
public class GetActivationCodeResponseType
    extends ResponseWithStatusType
{

    @XmlElement(name = "ActivationCode")
    protected String activationCode;
    @XmlElement(name = "ACExpiry")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acExpiry;

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
     * Gets the value of the acExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACExpiry() {
        return acExpiry;
    }

    /**
     * Sets the value of the acExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACExpiry(XMLGregorianCalendar value) {
        this.acExpiry = value;
    }

}
