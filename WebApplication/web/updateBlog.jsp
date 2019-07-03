<%-- 
    Document   : updateBlog
    Created on : 7 Apr, 2019, 2:01:18 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
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
        <title>Update Blog</title>
    </head>
    <body class="w3-light-blue">
        <div class="w3-bar w3-white w3-large">
            <a href="viewBlogs.jsp" class="w3-bar-item w3-button w3-red w3-mobile"><i class="fa fa-bed w3-margin-right"></i>Blog</a>
            <a href="AddBlog.jsp" class="w3-bar-item w3-button w3-mobile">Add Blog</a>
            <a href="deleteBlog.jsp" class="w3-bar-item w3-button w3-mobile">Delete Blog</a>
            <a href="updateBlog.jsp" class="w3-bar-item w3-button w3-mobile">Update Blog</a>
        </div>
        <h1 class="w3-center">Update Blog</h1>
        <form action="updateBlog" method="POST">
            <br>            
        <button type="button" class="btn btn-danger btn-lg"style="margin-left:700px" data-toggle="modal" data-target="#myModal">Update Blog</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Blog Id</h4>
          <input type="text" name="Id" style="width:100%" required>
        </div>
        
        
          <div class="modal-footer">
              <input type="submit" class="btn btn-default" value="update">
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
      </div>
      
    </div>
  </div>
        </form>
        <%--<form action="updateBlog" method="PUT">
            <table>
                    <tr>
                        <td>
                            Id 
                        </td>
                        <td>
                            <input type="text" name="Id" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Title 
                        </td>
                        <td>
                            <input type="text" name="title" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Content
                        </td>
                        <td>
                            <input type="text" name="data">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Author 
                        </td>
                        <td>
                            <input type="text" name="author_name" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="udpate">
                        </td>
                    </tr>
            </table>
</form>--%>
    </body>
</html>
