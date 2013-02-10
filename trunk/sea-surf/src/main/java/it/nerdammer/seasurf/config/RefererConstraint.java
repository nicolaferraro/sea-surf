//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.10 at 09:39:18 AM CET 
//


package it.nerdammer.seasurf.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referer-constraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referer-constraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="on-missing-referer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="BLOCK"/>
 *               &lt;enumeration value="ALLOW"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="include-origin" type="{http://www.nerdammer.it/sea-surf-config_1_0}request-origin"/>
 *         &lt;element name="exclude-origin" type="{http://www.nerdammer.it/sea-surf-config_1_0}request-origin" minOccurs="0"/>
 *         &lt;element name="include" type="{http://www.nerdammer.it/sea-surf-config_1_0}request-type-collection"/>
 *         &lt;element name="exclude" type="{http://www.nerdammer.it/sea-surf-config_1_0}request-type-collection" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referer-constraint", propOrder = {

})
public class RefererConstraint {

    @XmlElement(name = "on-missing-referer", required = true)
    protected String onMissingReferer;
    @XmlElement(name = "include-origin", required = true)
    protected RequestOrigin includeOrigin;
    @XmlElement(name = "exclude-origin")
    protected RequestOrigin excludeOrigin;
    @XmlElement(required = true)
    protected RequestTypeCollection include;
    protected RequestTypeCollection exclude;

    /**
     * Gets the value of the onMissingReferer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnMissingReferer() {
        return onMissingReferer;
    }

    /**
     * Sets the value of the onMissingReferer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnMissingReferer(String value) {
        this.onMissingReferer = value;
    }

    /**
     * Gets the value of the includeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOrigin }
     *     
     */
    public RequestOrigin getIncludeOrigin() {
        return includeOrigin;
    }

    /**
     * Sets the value of the includeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOrigin }
     *     
     */
    public void setIncludeOrigin(RequestOrigin value) {
        this.includeOrigin = value;
    }

    /**
     * Gets the value of the excludeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOrigin }
     *     
     */
    public RequestOrigin getExcludeOrigin() {
        return excludeOrigin;
    }

    /**
     * Sets the value of the excludeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOrigin }
     *     
     */
    public void setExcludeOrigin(RequestOrigin value) {
        this.excludeOrigin = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeCollection }
     *     
     */
    public RequestTypeCollection getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeCollection }
     *     
     */
    public void setInclude(RequestTypeCollection value) {
        this.include = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeCollection }
     *     
     */
    public RequestTypeCollection getExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeCollection }
     *     
     */
    public void setExclude(RequestTypeCollection value) {
        this.exclude = value;
    }

}
