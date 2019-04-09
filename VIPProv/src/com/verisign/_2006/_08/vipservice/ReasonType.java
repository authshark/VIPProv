
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="Stolen"/>
 *     &lt;enumeration value="Lost"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="TemporarilyUnavailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonType")
@XmlEnum
public enum ReasonType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Stolen")
    STOLEN("Stolen"),
    @XmlEnumValue("Lost")
    LOST("Lost"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Returned")
    RETURNED("Returned"),
    @XmlEnumValue("TemporarilyUnavailable")
    TEMPORARILY_UNAVAILABLE("TemporarilyUnavailable");
    private final String value;

    ReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonType fromValue(String v) {
        for (ReasonType c: ReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
