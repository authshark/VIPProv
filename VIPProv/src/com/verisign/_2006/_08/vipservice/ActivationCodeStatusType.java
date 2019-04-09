
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationCodeStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationCodeStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="PROVISIONED"/>
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivationCodeStatusType")
@XmlEnum
public enum ActivationCodeStatusType {

    NEW,
    PROVISIONED,
    DISABLED,
    EXPIRED;

    public String value() {
        return name();
    }

    public static ActivationCodeStatusType fromValue(String v) {
        return valueOf(v);
    }

}
