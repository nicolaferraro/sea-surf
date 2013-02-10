//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.10 at 09:39:18 AM CET 
//


package it.nerdammer.seasurf.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request-origin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request-origin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="page" type="{http://www.nerdammer.it/sea-surf-config_1_0}origin-page"/>
 *           &lt;element name="domain" type="{http://www.nerdammer.it/sea-surf-config_1_0}origin-domain"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request-origin", propOrder = {
    "pageOrDomain"
})
public class RequestOrigin {

    @XmlElementRefs({
        @XmlElementRef(name = "page", namespace = "http://www.nerdammer.it/sea-surf-config_1_0", type = JAXBElement.class),
        @XmlElementRef(name = "domain", namespace = "http://www.nerdammer.it/sea-surf-config_1_0", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> pageOrDomain;

    /**
     * Gets the value of the pageOrDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageOrDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageOrDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getPageOrDomain() {
        if (pageOrDomain == null) {
            pageOrDomain = new ArrayList<JAXBElement<String>>();
        }
        return this.pageOrDomain;
    }

}
