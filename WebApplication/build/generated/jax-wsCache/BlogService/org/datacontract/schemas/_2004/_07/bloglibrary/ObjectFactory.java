
package org.datacontract.schemas._2004._07.bloglibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.bloglibrary package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfBlog_QNAME = new QName("http://schemas.datacontract.org/2004/07/BlogLibrary", "ArrayOfBlog");
    private final static QName _Blog_QNAME = new QName("http://schemas.datacontract.org/2004/07/BlogLibrary", "Blog");
    private final static QName _BlogAuthor_QNAME = new QName("http://schemas.datacontract.org/2004/07/BlogLibrary", "Author");
    private final static QName _BlogTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/BlogLibrary", "Title");
    private final static QName _BlogData_QNAME = new QName("http://schemas.datacontract.org/2004/07/BlogLibrary", "Data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.bloglibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfBlog }
     * 
     */
    public ArrayOfBlog createArrayOfBlog() {
        return new ArrayOfBlog();
    }

    /**
     * Create an instance of {@link Blog }
     * 
     */
    public Blog createBlog() {
        return new Blog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BlogLibrary", name = "ArrayOfBlog")
    public JAXBElement<ArrayOfBlog> createArrayOfBlog(ArrayOfBlog value) {
        return new JAXBElement<ArrayOfBlog>(_ArrayOfBlog_QNAME, ArrayOfBlog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Blog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BlogLibrary", name = "Blog")
    public JAXBElement<Blog> createBlog(Blog value) {
        return new JAXBElement<Blog>(_Blog_QNAME, Blog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BlogLibrary", name = "Author", scope = Blog.class)
    public JAXBElement<String> createBlogAuthor(String value) {
        return new JAXBElement<String>(_BlogAuthor_QNAME, String.class, Blog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BlogLibrary", name = "Title", scope = Blog.class)
    public JAXBElement<String> createBlogTitle(String value) {
        return new JAXBElement<String>(_BlogTitle_QNAME, String.class, Blog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BlogLibrary", name = "Data", scope = Blog.class)
    public JAXBElement<String> createBlogData(String value) {
        return new JAXBElement<String>(_BlogData_QNAME, String.class, Blog.class, value);
    }

}
