
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bloglibrary.Blog;


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
 *         &lt;element name="ShowBlogResult" type="{http://schemas.datacontract.org/2004/07/BlogLibrary}Blog" minOccurs="0"/>
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
    "showBlogResult"
})
@XmlRootElement(name = "ShowBlogResponse")
public class ShowBlogResponse {

    @XmlElementRef(name = "ShowBlogResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Blog> showBlogResult;

    /**
     * Gets the value of the showBlogResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Blog }{@code >}
     *     
     */
    public JAXBElement<Blog> getShowBlogResult() {
        return showBlogResult;
    }

    /**
     * Sets the value of the showBlogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Blog }{@code >}
     *     
     */
    public void setShowBlogResult(JAXBElement<Blog> value) {
        this.showBlogResult = value;
    }

}
