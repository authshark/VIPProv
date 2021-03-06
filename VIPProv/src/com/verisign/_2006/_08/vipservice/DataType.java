
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cipher" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Digest" type="{http://www.verisign.com/2006/08/vipservice}DigestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder = {
    "cipher",
    "digest"
})
public class DataType {

    @XmlElement(name = "Cipher", required = true)
    protected byte[] cipher;
    @XmlElement(name = "Digest")
    protected DigestType digest;

    /**
     * Gets the value of the cipher property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCipher() {
        return cipher;
    }

    /**
     * Sets the value of the cipher property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCipher(byte[] value) {
        this.cipher = value;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link DigestType }
     *     
     */
    public DigestType getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestType }
     *     
     */
    public void setDigest(DigestType value) {
        this.digest = value;
    }

}
