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
 * <p>Java class for SecurityBytesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityBytesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WITH_LENGHTS"/>
 *     &lt;enumeration value="WITH_LENGHTS_AND_UDHL"/>
 *     &lt;enumeration value="NORMAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityBytesType")
@XmlEnum
public enum SecurityBytesType {

    WITH_LENGHTS,
    WITH_LENGHTS_AND_UDHL,
    NORMAL;

    public String value() {
        return name();
    }

    public static SecurityBytesType fromValue(String v) {
        return valueOf(v);
    }

}
