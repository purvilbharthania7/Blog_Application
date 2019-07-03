package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.datacontract.schemas._2004._07.bloglibrary.Blog;
import javax.xml.namespace.QName;
import javax.xml.bind.JAXBElement;
import org.tempuri.IBlogService;
import org.tempuri.BlogService;

public final class AddBlog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Oswald\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open Sans\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("    body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Blog</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"w3-light-blue\">\n");
      out.write("        <div class=\"w3-bar w3-white w3-large\">\n");
      out.write("            <a href=\"viewBlogs.jsp\" class=\"w3-bar-item w3-button w3-red w3-mobile\"><i class=\"fa fa-bed w3-margin-right\"></i>Blog</a>\n");
      out.write("            <a href=\"AddBlog.jsp\" class=\"w3-bar-item w3-button w3-mobile\">Add Blog</a>\n");
      out.write("            <a href=\"deleteBlog.jsp\" class=\"w3-bar-item w3-button w3-mobile\">Delete Blog</a>\n");
      out.write("            <a href=\"updateBlog.jsp\" class=\"w3-bar-item w3-button w3-mobile\">Update Blog</a>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"AddBlog\" method=\"POST\">\n");
      out.write("        <h1 class=\"w3-center\">Add New Blog</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("  <!-- Trigger the modal with a button -->\n");
      out.write("  <button type=\"button\" class=\"btn btn-danger btn-lg\"style=\"margin-left:500px\" data-toggle=\"modal\" data-target=\"#myModal\">Add Blog</button>\n");
      out.write("\n");
      out.write("  <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Blog Title</h4>\n");
      out.write("          <input type=\"text\" name=\"title\" style=\"width:100%\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <p>Description</p>\n");
      out.write("          <textarea  name=\"data\" style=\"height:200px; width:100%\" required></textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <p>Author Name:</p>\n");
      out.write("            <input type=\"text\" name=\"author_name\" style=\"width:100%\" required>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("              <input type=\"submit\" class=\"btn btn-default\" value=\"add\">\n");
      out.write("              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
