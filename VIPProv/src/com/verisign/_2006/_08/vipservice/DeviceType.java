
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Secret" type="{http://www.verisign.com/2006/08/vipservice}SecretType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceType", propOrder = {
    "secret"
})
public class DeviceType {

    @XmlElement(name = "Secret", required = true)
    protected SecretType secret;

    /**
     * Gets the value of the secret property.
     * 
     * @return
     *     possible object is
     *     {@link SecretType }
     *     
     */
    public SecretType getSecret() {
        return secret;
    }

    /**
     * Sets the value of the secret property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecretType }
     *     
     */
    public void setSecret(SecretType value) {
        this.secret = value;
    }

}
