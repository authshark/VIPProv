
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Generic Status response for the UA Web Service.
 *            		    Status Response messages also contains a status indicating success or cause of failure.
 *         		
 * 
 * <p>Java class for ResponseWithStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseWithStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}ResponseAbstractType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.verisign.com/2006/08/vipservice}StatusType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseWithStatusType", propOrder = {
    "status"
})
@XmlSeeAlso({
    GetServerTimeResponseType.class,
    GetSharedSecretResponseType.class,
    GetACStatusResponseType.class,
    GetOrderStatusResponseType.class,
    GetActivationCodeResponseType.class
})
public class ResponseWithStatusType
    extends ResponseAbstractType
{

    @XmlElement(name = "Status", required = true)
    protected StatusType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
