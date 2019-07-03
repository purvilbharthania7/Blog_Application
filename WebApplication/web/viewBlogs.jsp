<%-- 
    Document   : viewBlogs
    Created on : 7 Apr, 2019, 12:02:29 PM
    Author     : SONY
--%>
<%--<%@page import="org.datacontract.schemas._2004._07.bloglibrary.User"%>
//<%@page import="org.datacontract.schemas._2004._07.bloglibrary.ArrayOfUser"%>--%>
<%@page import="org.datacontract.schemas._2004._07.bloglibrary.ArrayOfBlog"%>
<%@page import="org.datacontract.schemas._2004._07.bloglibrary.Blog"%>
<%@page import="org.tempuri.IBlogService"%>
<%@page import="org.tempuri.BlogService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Oswald">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open Sans">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
    body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Blogs</title>
    </head>
    <!--<script>
        var today=new Date();
        var dd=String(today.getDate()).padStart(2,'0');
        var mm=String(today.getMonth()).padStart(2,'0');
        var yyyy=today.getFullyear();
        today=mm+'/'+dd+'/'+yyyy;
        </script>-->
    
    <body class="w3-light-blue">
        <div class="w3-bar w3-white w3-large">
            <a href="viewBlogs.jsp" class="w3-bar-item w3-button w3-red w3-mobile"><i class="fa fa-bed w3-margin-right"></i>Blog</a>
            <a href="AddBlog.jsp" class="w3-bar-item w3-button w3-mobile">Add Blog</a>
            <a href="deleteBlog.jsp" class="w3-bar-item w3-button w3-mobile">Delete Blog</a>
            <a href="updateBlog.jsp" class="w3-bar-item w3-button w3-mobile">Update Blog</a>
        </div>
        <%
            BlogService service=new BlogService();
            IBlogService Client=service.getBasicHttpBindingIBlogService();
            //int userid=(int)request.getAttribute("userid");
            //Integer userid=(Integer)getServletContext().getAttribute("userid");
            //String userpassword=getServletContext().getAttribute("userpassword").toString();
            //ArrayOfNote notes = Client.getNotes(1006);
            ArrayOfBlog blogs1=Client.showBlogs();
            //User user = Client.getUser(userid, userpassword);
            //String username=user.getUsername().getValue();
            //String uname=user.getUsername().getValue().toUpperCase();
            //getServletContext().setAttribute("username",username);
        %>
        
        <header class="w3-container w3-center w3-padding-32"> 
        <h1><b>MY BLOG</b></h1>
        <p>Welcome to the blog</p>
        <br>
        <h3>Blog Records</h3>
        </header>
        
        
  
        
        <%
        for(Blog blog :blogs1.getBlog())
            {%>
            <div class="w3-col 30 s12">
            
                <div class="w3-card-4 w3-margin w3-white">
                    <div class="w3-container">
                    
                    <%=
                        "<h3>"+"<b>"+blog.getTitle().getValue()+"</b>"+"</h3>"+
                        "<h5>"+blog.getId()+ "</h5>"+
                        "<h5>"+blog.getAuthor().getValue()+ "</h5>"
                    %>
                        <h5><span class="w3-opacity">April 7, 2014</span></h5>
                    </div>

                <div class="w3-container">
                    <%=
                    "<p>"+blog.getData().getValue()+"</p>"
                    %>
                    <div class="w3-row">
                        <div class="w3-col m8 s12">
                            <p class="w3-left"><button class="w3-button w3-white w3-border" onclick="likeFunction(this)"><b><i class="fa fa-thumbs-up"></i> Like</b></button></p>
                        </div>
                        <div class="w3-col m4 w3-hide-small">
                            <p><span class="w3-padding-large w3-right"><b>Comments  </b> <span class="w3-tag">0</span></span></p>
                        </div>
                    </div>
                </div>
            </div>
            
            
        
        <%}
        %>
        <%--<a href="AddBlog.jsp">Add Blog</a>&nbsp;&nbsp;
        <a href="updateBlog.jsp">Update Blog</a>&nbsp;&nbsp;
        <a href="deleteBlog.jsp">Delete Blog</a>&nbsp;&nbsp;
        <a href="deleteUser.jsp">Remove User</a>&nbsp;&nbsp;
        <a href="updateUser.jsp">Update User</a>&nbsp;&nbsp;
<a href="index.jsp">Logout</a><br>--%>
        <script>
        function likeFunction(x) {
  x.style.fontWeight = "bold";
  x.innerHTML = "✓ Liked";
}
</script>
    </body>
</html>
