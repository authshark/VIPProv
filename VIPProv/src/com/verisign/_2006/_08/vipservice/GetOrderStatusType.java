
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Request to Get Order Status from an Issuer. Includes an order profile id that indicates the interested order.
 *                 
 * 
 * <p>Java class for GetOrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}AccountRequestAbstractType">
 *       &lt;sequence>
 *         &lt;element name="OrderProfileId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value="[a-zA-Z0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderStatusType", propOrder = {
    "orderProfileId"
})
public class GetOrderStatusType
    extends AccountRequestAbstractType
{

    @XmlElement(name = "OrderProfileId", required = true)
    protected String orderProfileId;

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
