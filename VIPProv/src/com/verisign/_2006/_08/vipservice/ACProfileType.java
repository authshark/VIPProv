
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACProfileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILEPHONE"/>
 *     &lt;enumeration value="COMPUTER"/>
 *     &lt;enumeration value="MOBILE_NUMERIC_MEDIUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACProfileType")
@XmlEnum
public enum ACProfileType {

    MOBILEPHONE,
    COMPUTER,
    MOBILE_NUMERIC_MEDIUM;

    public String value() {
        return name();
    }

    public static ACProfileType fromValue(String v) {
        return valueOf(v);
    }

}
