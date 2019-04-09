
package com.verisign._2006._08.vipservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Counter - is the Event counter
 *             		TimeStep (X) - time step in seconds
 *             		Time (T0) - UTC timestamp (number of seconds since epoch) when time step starts to count.  T0 = 0 at epoch
 *         		
 * 
 * <p>Java class for UsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AI" type="{http://www.verisign.com/2006/08/vipservice}OtpAlgorithmIdentifierType" minOccurs="0"/>
 *         &lt;element name="Counter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TimeStep" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClockDrift" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="otp" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageType", propOrder = {
    "ai",
    "counter",
    "timeStep",
    "time",
    "clockDrift"
})
public class UsageType {

    @XmlElement(name = "AI")
    protected OtpAlgorithmIdentifierType ai;
    @XmlElement(name = "Counter", defaultValue = "0")
    protected BigInteger counter;
    @XmlElement(name = "TimeStep", defaultValue = "30")
    protected BigInteger timeStep;
    @XmlElement(name = "Time", defaultValue = "0")
    protected BigInteger time;
    @XmlElement(name = "ClockDrift", defaultValue = "0")
    protected BigInteger clockDrift;
    @XmlAttribute(name = "otp")
    protected Boolean otp;

    /**
     * Gets the value of the ai property.
     * 
     * @return
     *     possible object is
     *     {@link OtpAlgorithmIdentifierType }
     *     
     */
    public OtpAlgorithmIdentifierType getAI() {
        return ai;
    }

    /**
     * Sets the value of the ai property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtpAlgorithmIdentifierType }
     *     
     */
    public void setAI(OtpAlgorithmIdentifierType value) {
        this.ai = value;
    }

    /**
     * Gets the value of the counter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCounter() {
        return counter;
    }

    /**
     * Sets the value of the counter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCounter(BigInteger value) {
        this.counter = value;
    }

    /**
     * Gets the value of the timeStep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeStep() {
        return timeStep;
    }

    /**
     * Sets the value of the timeStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeStep(BigInteger value) {
        this.timeStep = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTime(BigInteger value) {
        this.time = value;
    }

    /**
     * Gets the value of the clockDrift property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClockDrift() {
        return clockDrift;
    }

    /**
     * Sets the value of the clockDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClockDrift(BigInteger value) {
        this.clockDrift = value;
    }

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOtp() {
        if (otp == null) {
            return false;
        } else {
            return otp;
        }
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtp(Boolean value) {
        this.otp = value;
    }

}
