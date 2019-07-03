<%-- 
    Document   : update1Blog
    Created on : 8 Apr, 2019, 2:31:11 AM
    Author     : SONY
--%>
<%@page import="org.datacontract.schemas._2004._07.bloglibrary.Blog"%>
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
        <title>JSP Page</title>
    </head>
    <body class="w3-light-blue">
        <div class="w3-bar w3-white w3-large">
            <a href="viewBlogs.jsp" class="w3-bar-item w3-button w3-red w3-mobile"><i class="fa fa-bed w3-margin-right"></i>Blog</a>
            <a href="AddBlog.jsp" class="w3-bar-item w3-button w3-mobile">Add Blog</a>
            <a href="deleteBlog.jsp" class="w3-bar-item w3-button w3-mobile">Delete Blog</a>
            <a href="updateBlog.jsp" class="w3-bar-item w3-button w3-mobile">Update Blog</a>
        </div>
        <form action="update1Blog" method="PUT">
        <h1 class="w3-center">Update Blog</h1>
        <%
        Blog bg = (Blog)request.getAttribute("bg");
        %>
        <div class="w3-col 30 s12">
            
                <div class="w3-card-4 w3-margin w3-white">
                    <div class="w3-container">
                        <%
			Integer Id = bg.getId();
                        String title = bg.getTitle().getValue().toString();
                        String data = bg.getData().getValue().toString();
                        String author_name=bg.getAuthor().getValue().toString();
                        %>
                        <%--<h3><input type="text" name="Id" id="Id" value=<% out.print(Id); %> /></h3>
                    <h3><input type="text" name="title" id="title" value=<% out.print(title); %> /></h3>
<h5><input type="text" name="author_name" id="author_name" value=<% out.print(author_name); %> /></h5>--%>
                    <%=
                        "<h3>"+"<b>"+bg.getTitle().getValue()+"</b>"+"</h3>"+
                        "<h5>"+bg.getAuthor().getValue()+ "</h5>"
%>
                        <h5><span class="w3-opacity">April 7, 2014</span></h5>
                    </div>

                <div class="w3-container">
                    
                    <%=
                    "<p>"+bg.getData().getValue()+"</p>"
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
            <h2><input style="margin-left:20px" type="text" id="Id" name="Id" value=<% out.print(Id); %> /></h2>        
            <h2><input style="margin-left:20px" type="text" name="title" id="title" placeholder="Blog's Title" required></h2>
            <h2><input style="margin-left:20px" type="text" name="author_name" id="author_name" placeholder="Blog's Author name" required></h2>
            <h2><input style="margin-left:20px" type="text" name="data" id="data" placeholder="Blog's Content" required></h2>
            <h3><input style="margin-left:20px" type="Submit" name="Update" value="Update" id="submit"/></h3>
        </form>
    </body>
</html>
