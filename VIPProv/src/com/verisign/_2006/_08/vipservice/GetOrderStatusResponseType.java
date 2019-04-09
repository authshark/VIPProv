
package com.verisign._2006._08.vipservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Response to a request to get order status. A successful response contains the order status.
 *                 
 * 
 * <p>Java class for GetOrderStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}ResponseWithStatusType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="OrderProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableSharedSecrets" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderStatusResponseType", propOrder = {
    "orderProfileName",
    "availableSharedSecrets"
})
public class GetOrderStatusResponseType
    extends ResponseWithStatusType
{

    @XmlElement(name = "OrderProfileName")
    protected String orderProfileName;
    @XmlElement(name = "AvailableSharedSecrets")
    protected BigInteger availableSharedSecrets;

    /**
     * Gets the value of the orderProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderProfileName() {
        return orderProfileName;
    }

    /**
     * Sets the value of the orderProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderProfileName(String value) {
        this.orderProfileName = value;
    }

    /**
     * Gets the value of the availableSharedSecrets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableSharedSecrets() {
        return availableSharedSecrets;
    }

    /**
     * Sets the value of the availableSharedSecrets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableSharedSecrets(BigInteger value) {
        this.availableSharedSecrets = value;
    }

}
