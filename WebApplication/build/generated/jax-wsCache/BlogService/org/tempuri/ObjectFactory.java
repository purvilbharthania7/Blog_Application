
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.bloglibrary.ArrayOfBlog;
import org.datacontract.schemas._2004._07.bloglibrary.Blog;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ShowBlogsResponseShowBlogsResult_QNAME = new QName("http://tempuri.org/", "ShowBlogsResult");
    private final static QName _ShowBlogResponseShowBlogResult_QNAME = new QName("http://tempuri.org/", "ShowBlogResult");
    private final static QName _UpdateBlogAuthorName_QNAME = new QName("http://tempuri.org/", "author_name");
    private final static QName _UpdateBlogData_QNAME = new QName("http://tempuri.org/", "data");
    private final static QName _UpdateBlogTitle_QNAME = new QName("http://tempuri.org/", "title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBlogResponse }
     * 
     */
    public DeleteBlogResponse createDeleteBlogResponse() {
        return new DeleteBlogResponse();
    }

    /**
     * Create an instance of {@link AddBlogResponse }
     * 
     */
    public AddBlogResponse createAddBlogResponse() {
        return new AddBlogResponse();
    }

    /**
     * Create an instance of {@link UpdateBlogResponse }
     * 
     */
    public UpdateBlogResponse createUpdateBlogResponse() {
        return new UpdateBlogResponse();
    }

    /**
     * Create an instance of {@link ShowBlogs }
     * 
     */
    public ShowBlogs createShowBlogs() {
        return new ShowBlogs();
    }

    /**
     * Create an instance of {@link AddBlog }
     * 
     */
    public AddBlog createAddBlog() {
        return new AddBlog();
    }

    /**
     * Create an instance of {@link ShowBlogsResponse }
     * 
     */
    public ShowBlogsResponse createShowBlogsResponse() {
        return new ShowBlogsResponse();
    }

    /**
     * Create an instance of {@link ShowBlogResponse }
     * 
     */
    public ShowBlogResponse createShowBlogResponse() {
        return new ShowBlogResponse();
    }

    /**
     * Create an instance of {@link DeleteBlog }
     * 
     */
    public DeleteBlog createDeleteBlog() {
        return new DeleteBlog();
    }

    /**
     * Create an instance of {@link UpdateBlog }
     * 
     */
    public UpdateBlog createUpdateBlog() {
        return new UpdateBlog();
    }

    /**
     * Create an instance of {@link ShowBlog }
     * 
     */
    public ShowBlog createShowBlog() {
        return new ShowBlog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ShowBlogsResult", scope = ShowBlogsResponse.class)
    public JAXBElement<ArrayOfBlog> createShowBlogsResponseShowBlogsResult(ArrayOfBlog value) {
        return new JAXBElement<ArrayOfBlog>(_ShowBlogsResponseShowBlogsResult_QNAME, ArrayOfBlog.class, ShowBlogsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Blog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ShowBlogResult", scope = ShowBlogResponse.class)
    public JAXBElement<Blog> createShowBlogResponseShowBlogResult(Blog value) {
        return new JAXBElement<Blog>(_ShowBlogResponseShowBlogResult_QNAME, Blog.class, ShowBlogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author_name", scope = UpdateBlog.class)
    public JAXBElement<String> createUpdateBlogAuthorName(String value) {
        return new JAXBElement<String>(_UpdateBlogAuthorName_QNAME, String.class, UpdateBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "data", scope = UpdateBlog.class)
    public JAXBElement<String> createUpdateBlogData(String value) {
        return new JAXBElement<String>(_UpdateBlogData_QNAME, String.class, UpdateBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "title", scope = UpdateBlog.class)
    public JAXBElement<String> createUpdateBlogTitle(String value) {
        return new JAXBElement<String>(_UpdateBlogTitle_QNAME, String.class, UpdateBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author_name", scope = AddBlog.class)
    public JAXBElement<String> createAddBlogAuthorName(String value) {
        return new JAXBElement<String>(_UpdateBlogAuthorName_QNAME, String.class, AddBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "data", scope = AddBlog.class)
    public JAXBElement<String> createAddBlogData(String value) {
        return new JAXBElement<String>(_UpdateBlogData_QNAME, String.class, AddBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "title", scope = AddBlog.class)
    public JAXBElement<String> createAddBlogTitle(String value) {
        return new JAXBElement<String>(_UpdateBlogTitle_QNAME, String.class, AddBlog.class, value);
    }

}
