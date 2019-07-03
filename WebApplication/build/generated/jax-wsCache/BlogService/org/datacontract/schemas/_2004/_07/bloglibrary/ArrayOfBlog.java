
package org.datacontract.schemas._2004._07.bloglibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBlog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBlog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Blog" type="{http://schemas.datacontract.org/2004/07/BlogLibrary}Blog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBlog", propOrder = {
    "blog"
})
public class ArrayOfBlog {

    @XmlElement(name = "Blog", nillable = true)
    protected List<Blog> blog;

    /**
     * Gets the value of the blog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Blog }
     * 
     * 
     */
    public List<Blog> getBlog() {
        if (blog == null) {
            blog = new ArrayList<Blog>();
        }
        return this.blog;
    }

}
