
package com.verisign._2006._08.vipservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.verisign.com/2006/08/vipservice}EncryptionAlgorithm"/>
 *         &lt;choice>
 *           &lt;element name="EncKeyLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;element name="PBESalt" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *             &lt;element name="PBEIterationCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *             &lt;element name="IV" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionMethodType", propOrder = {
    "encryptionAlgorithm",
    "encKeyLabel",
    "pbeSalt",
    "pbeIterationCount",
    "iv"
})
public class EncryptionMethodType {

    @XmlElement(name = "EncryptionAlgorithm", required = true)
    @XmlSchemaType(name = "string")
    protected EncryptionAlgorithmType encryptionAlgorithm;
    @XmlElement(name = "EncKeyLabel")
    protected String encKeyLabel;
    @XmlElement(name = "PBESalt")
    protected byte[] pbeSalt;
    @XmlElement(name = "PBEIterationCount")
    protected BigInteger pbeIterationCount;
    @XmlElement(name = "IV")
    protected byte[] iv;

    /**
     * Gets the value of the encryptionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionAlgorithmType }
     *     
     */
    public EncryptionAlgorithmType getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Sets the value of the encryptionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionAlgorithmType }
     *     
     */
    public void setEncryptionAlgorithm(EncryptionAlgorithmType value) {
        this.encryptionAlgorithm = value;
    }

    /**
     * Gets the value of the encKeyLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncKeyLabel() {
        return encKeyLabel;
    }

    /**
     * Sets the value of the encKeyLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncKeyLabel(String value) {
        this.encKeyLabel = value;
    }

    /**
     * Gets the value of the pbeSalt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPBESalt() {
        return pbeSalt;
    }

    /**
     * Sets the value of the pbeSalt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPBESalt(byte[] value) {
        this.pbeSalt = value;
    }

    /**
     * Gets the value of the pbeIterationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPBEIterationCount() {
        return pbeIterationCount;
    }

    /**
     * Sets the value of the pbeIterationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPBEIterationCount(BigInteger value) {
        this.pbeIterationCount = value;
    }

    /**
     * Gets the value of the iv property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIV() {
        return iv;
    }

    /**
     * Sets the value of the iv property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIV(byte[] value) {
        this.iv = value;
    }

}
