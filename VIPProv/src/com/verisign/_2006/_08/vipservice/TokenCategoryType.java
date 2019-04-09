
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OATH_EVENT"/>
 *     &lt;enumeration value="VASCO_TIME"/>
 *     &lt;enumeration value="SERVER_OTP"/>
 *     &lt;enumeration value="OATH_TIME"/>
 *     &lt;enumeration value="SMS_OTP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TokenCategoryType")
@XmlEnum
public enum TokenCategoryType {

    OATH_EVENT,
    VASCO_TIME,
    SERVER_OTP,
    OATH_TIME,
    SMS_OTP;

    public String value() {
        return name();
    }

    public static TokenCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
