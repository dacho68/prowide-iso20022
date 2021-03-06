
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANI"/&gt;
 *     &lt;enumeration value="CANS"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="CXLR"/&gt;
 *     &lt;enumeration value="CANT"/&gt;
 *     &lt;enumeration value="CANZ"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="SCEX"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CANO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason10Code")
@XmlEnum
public enum CancelledStatusReason10Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Transaction is cancelled by the system.
     * 
     */
    CANS,

    /**
     * Instruction has been cancelled by the agent due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.
     * 
     */
    CXLR,

    /**
     * Original transaction has been cancelled and replaced due to a corporate action.
     * 
     */
    CANT,

    /**
     * Original transaction has been cancelled and replaced to allow a partial or split settlement.
     * 
     */
    CANZ,

    /**
     * Transaction has been cancelled due to a corporate action.
     * 
     */
    CORP,

    /**
     * Transaction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used.
     * 
     */
    SCEX,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Transaction is cancelled by a party other than the instructing party, for example, a market infrastructure such as a stock exchange.
     * 
     */
    CANO;

    public String value() {
        return name();
    }

    public static CancelledStatusReason10Code fromValue(String v) {
        return valueOf(v);
    }

}
