
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Contains the configuration information about the Event based Adapter Type.
 *         		
 * 
 * <p>Java class for AdapterInfoEventBasedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdapterInfoEventBasedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxFailedAttempts" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="2"/>
 *               &lt;maxInclusive value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AllowGetNextOTP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LookAheadWindow" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="2"/>
 *               &lt;maxInclusive value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SyncLookAheadWindow" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="4"/>
 *               &lt;maxInclusive value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaxGenNextOTP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AutoSyncEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoSyncLookAheadWindow" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="3"/>
 *               &lt;maxInclusive value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AutoSyncThreshold" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="63"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdapterInfoEventBasedType", propOrder = {
    "maxFailedAttempts",
    "allowGetNextOTP",
    "lookAheadWindow",
    "syncLookAheadWindow",
    "maxGenNextOTP",
    "autoSyncEnable",
    "autoSyncLookAheadWindow",
    "autoSyncThreshold"
})
public class AdapterInfoEventBasedType {

    @XmlElement(name = "MaxFailedAttempts")
    protected Integer maxFailedAttempts;
    @XmlElement(name = "AllowGetNextOTP")
    protected Boolean allowGetNextOTP;
    @XmlElement(name = "LookAheadWindow")
    protected Integer lookAheadWindow;
    @XmlElement(name = "SyncLookAheadWindow")
    protected Integer syncLookAheadWindow;
    @XmlElement(name = "MaxGenNextOTP")
    protected Integer maxGenNextOTP;
    @XmlElement(name = "AutoSyncEnable")
    protected Boolean autoSyncEnable;
    @XmlElement(name = "AutoSyncLookAheadWindow")
    protected Integer autoSyncLookAheadWindow;
    @XmlElement(name = "AutoSyncThreshold")
    protected Integer autoSyncThreshold;

    /**
     * Gets the value of the maxFailedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFailedAttempts() {
        return maxFailedAttempts;
    }

    /**
     * Sets the value of the maxFailedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFailedAttempts(Integer value) {
        this.maxFailedAttempts = value;
    }

    /**
     * Gets the value of the allowGetNextOTP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowGetNextOTP() {
        return allowGetNextOTP;
    }

    /**
     * Sets the value of the allowGetNextOTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowGetNextOTP(Boolean value) {
        this.allowGetNextOTP = value;
    }

    /**
     * Gets the value of the lookAheadWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLookAheadWindow() {
        return lookAheadWindow;
    }

    /**
     * Sets the value of the lookAheadWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLookAheadWindow(Integer value) {
        this.lookAheadWindow = value;
    }

    /**
     * Gets the value of the syncLookAheadWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSyncLookAheadWindow() {
        return syncLookAheadWindow;
    }

    /**
     * Sets the value of the syncLookAheadWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSyncLookAheadWindow(Integer value) {
        this.syncLookAheadWindow = value;
    }

    /**
     * Gets the value of the maxGenNextOTP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGenNextOTP() {
        return maxGenNextOTP;
    }

    /**
     * Sets the value of the maxGenNextOTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGenNextOTP(Integer value) {
        this.maxGenNextOTP = value;
    }

    /**
     * Gets the value of the autoSyncEnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSyncEnable() {
        return autoSyncEnable;
    }

    /**
     * Sets the value of the autoSyncEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSyncEnable(Boolean value) {
        this.autoSyncEnable = value;
    }

    /**
     * Gets the value of the autoSyncLookAheadWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoSyncLookAheadWindow() {
        return autoSyncLookAheadWindow;
    }

    /**
     * Sets the value of the autoSyncLookAheadWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoSyncLookAheadWindow(Integer value) {
        this.autoSyncLookAheadWindow = value;
    }

    /**
     * Gets the value of the autoSyncThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoSyncThreshold() {
        return autoSyncThreshold;
    }

    /**
     * Sets the value of the autoSyncThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoSyncThreshold(Integer value) {
        this.autoSyncThreshold = value;
    }

}
