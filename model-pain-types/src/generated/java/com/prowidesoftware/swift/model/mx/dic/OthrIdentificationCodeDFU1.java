
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OthrIdentificationCode_DFU1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OthrIdentificationCode_DFU1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTPROVIDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OthrIdentificationCode_DFU1")
@XmlEnum
public enum OthrIdentificationCodeDFU1 {


    /**
     * NOTPROVIDED
     * 
     */
    NOTPROVIDED;

    public String value() {
        return name();
    }

    public static OthrIdentificationCodeDFU1 fromValue(String v) {
        return valueOf(v);
    }

}
