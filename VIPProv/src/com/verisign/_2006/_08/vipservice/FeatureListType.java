
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Contains the information of an account.
 *         		
 * 
 * <p>Java class for FeatureListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TokenShared" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureListType", propOrder = {
    "tokenShared"
})
public class FeatureListType {

    @XmlElement(name = "TokenShared")
    protected boolean tokenShared;

    /**
     * Gets the value of the tokenShared property.
     * 
     */
    public boolean isTokenShared() {
        return tokenShared;
    }

    /**
     * Sets the value of the tokenShared property.
     * 
     */
    public void setTokenShared(boolean value) {
        this.tokenShared = value;
    }

}
