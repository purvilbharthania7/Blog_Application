
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bloglibrary.ArrayOfBlog;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShowBlogsResult" type="{http://schemas.datacontract.org/2004/07/BlogLibrary}ArrayOfBlog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "showBlogsResult"
})
@XmlRootElement(name = "ShowBlogsResponse")
public class ShowBlogsResponse {

    @XmlElementRef(name = "ShowBlogsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBlog> showBlogsResult;

    /**
     * Gets the value of the showBlogsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBlog }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBlog> getShowBlogsResult() {
        return showBlogsResult;
    }

    /**
     * Sets the value of the showBlogsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBlog }{@code >}
     *     
     */
    public void setShowBlogsResult(JAXBElement<ArrayOfBlog> value) {
        this.showBlogsResult = value;
    }

}
