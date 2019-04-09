
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdapterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdapterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OATH_EVENT_BASIC"/>
 *     &lt;enumeration value="OATH_EVENT_ADVANCED_1"/>
 *     &lt;enumeration value="OATH_EVENT_ADVANCED_2"/>
 *     &lt;enumeration value="VASCO_TIME"/>
 *     &lt;enumeration value="SERVER_OTP"/>
 *     &lt;enumeration value="OATH_TIME"/>
 *     &lt;enumeration value="SMS_OTP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdapterType")
@XmlEnum
public enum AdapterType {

    OATH_EVENT_BASIC,
    OATH_EVENT_ADVANCED_1,
    OATH_EVENT_ADVANCED_2,
    VASCO_TIME,
    SERVER_OTP,
    OATH_TIME,
    SMS_OTP;

    public String value() {
        return name();
    }

    public static AdapterType fromValue(String v) {
        return valueOf(v);
    }

}
