
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedSecretDeliveryMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharedSecretDeliveryMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTTPS"/>
 *     &lt;enumeration value="SMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharedSecretDeliveryMethodType")
@XmlEnum
public enum SharedSecretDeliveryMethodType {

    HTTPS,
    SMS;

    public String value() {
        return name();
    }

    public static SharedSecretDeliveryMethodType fromValue(String v) {
        return valueOf(v);
    }

}
