
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Abstract class for all request messages that are supported by the UA Web Service. Id is a pseudo-random number used for request-response matching.
 *         		
 * 
 * <p>Java class for RequestAbstractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAbstractType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}MessageAbstractType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.verisign.com/2006/08/vipservice}IdType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAbstractType")
@XmlSeeAlso({
    GetServerTimeType.class,
    GetSharedSecretType.class,
    AccountRequestAbstractType.class
})
public abstract class RequestAbstractType
    extends MessageAbstractType
{

    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
