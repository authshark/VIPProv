
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SMSOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REGISTER"/>
 *     &lt;enumeration value="SEND_MESSAGE"/>
 *     &lt;enumeration value="PASS_THROUGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SMSOperationType")
@XmlEnum
public enum SMSOperationType {

    REGISTER,
    SEND_MESSAGE,
    PASS_THROUGH;

    public String value() {
        return name();
    }

    public static SMSOperationType fromValue(String v) {
        return valueOf(v);
    }

}
