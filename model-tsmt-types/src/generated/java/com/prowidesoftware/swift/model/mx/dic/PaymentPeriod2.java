
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the payment terms by means of a code and a period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPeriod2", propOrder = {
    "cd",
    "nbOfDays"
})
public class PaymentPeriod2 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentTime2Code cd;
    @XmlElement(name = "NbOfDays")
    protected BigDecimal nbOfDays;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTime2Code }
     *     
     */
    public PaymentTime2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTime2Code }
     *     
     */
    public PaymentPeriod2 setCd(PaymentTime2Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentPeriod2 setNbOfDays(BigDecimal value) {
        this.nbOfDays = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
