//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 04:14:20 PM MSD 
//


package ru.tapublog.lib.gsm0348.api.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_SECURITY"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="DS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificationMode")
@XmlEnum
public enum CertificationMode {

    NO_SECURITY,
    RC,
    CC,
    DS;

    public String value() {
        return name();
    }

    public static CertificationMode fromValue(String v) {
        return valueOf(v);
    }

}
