
package com.verisign._2006._08.vipservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Abstract class for all request messages that are supported by the UA Web Service. Id is a pseudo-random number used for request-response matching.
 *         		
 * 
 * <p>Java class for AccountRequestAbstractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRequestAbstractType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verisign.com/2006/08/vipservice}RequestAbstractType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRequestAbstractType")
@XmlSeeAlso({
    GetOrderStatusType.class,
    GetActivationCodeType.class,
    GetACStatusType.class,
    TokenRequestType.class
})
public abstract class AccountRequestAbstractType
    extends RequestAbstractType
{


}
