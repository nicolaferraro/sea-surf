//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.09 at 06:28:42 PM CET 
//


package it.nerdammer.seasurf.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security-token-constraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security-token-constraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security-token-constraint" type="{http://www.nerdammer.it/sea-surf-config_1_0}security-token-constraint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-token-constraints", propOrder = {
    "securityTokenConstraint"
})
public class SecurityTokenConstraints {

    @XmlElement(name = "security-token-constraint", required = true)
    protected List<SecurityTokenConstraint> securityTokenConstraint;

    /**
     * Gets the value of the securityTokenConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityTokenConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityTokenConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityTokenConstraint }
     * 
     * 
     */
    public List<SecurityTokenConstraint> getSecurityTokenConstraint() {
        if (securityTokenConstraint == null) {
            securityTokenConstraint = new ArrayList<SecurityTokenConstraint>();
        }
        return this.securityTokenConstraint;
    }

}