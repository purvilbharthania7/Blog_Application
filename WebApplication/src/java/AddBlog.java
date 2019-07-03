/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tempuri.IBlogService;
import org.tempuri.BlogService;

/**
 *
 * @author SONY
 */
@WebServlet(urlPatterns = {"/AddBlog"})
public class AddBlog extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddBlog</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddBlog at " + request.getContextPath() + "</h1>");
            out.println("<h1>Blog title :"+request.getParameter("title")+" </h1");
            out.println("<h1>Blog content :"+request.getParameter("data")+" </h1>");
            out.println("<h1>Blog author :"+request.getParameter("author_name")+" </h1>");
            out.println("<a href='viewBlogs.jsp'>View Blogs</a>");
            out.println("</body>");
            out.println("</html>");
            BlogService service=new BlogService();
             IBlogService Client=service.getBasicHttpBindingIBlogService();
              String title=request.getParameter("title");
              String data=request.getParameter("data");
              String author_name=request.getParameter("author_name");    
              //Integer userid=(Integer)getServletContext().getAttribute("userid");
              Client.addBlog(author_name,title,data);
              RequestDispatcher rd = request.getRequestDispatcher("viewBlogs.jsp");
              rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}