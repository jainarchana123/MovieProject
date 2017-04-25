<%-- 
    Document   : Movie
    Created on : Apr 11, 2017, 7:25:08 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/bootstrap.js"></script>
        <style>
            .topnav{
          background-color: #333;
          overflow:hidden;
          }
          .topnav a{
          float:left;
          display:block;
          color: #f2f2f2;
          text-align:center;
          padding:14px 48.3px;
          text-decoration:none;
          font-size:17px;
          }
          .topnav a:hover{
          background-color:#ddd;
          color:black;
          }
          .topnav a,active{
          background-color:#4caf50;color:white;
        }
        </style>
    </head>
    <body bgcolor="lightgrey">
        <div class="topnav" id="mytopnav">
            <a href="index.jsp"><b>Home</b></a>
            <a href="Movie.jsp"><b>Movies</b></a>
            <a href="Theater.jsp"><b>Theatres</b></a>
            <a href="Am.jsp"><b>Assign Movies</b></a>
            <a href="home.jsp"><b>Admin Home</b></a>
            <a href="Logout.jsp"><b>Log Out</b></a>
        </div>
        <div class="well text-center">
            <h2>Add New Movie</h2>
        </div>
        <div class="col-md-4 col-md-offset-4">
            <form action="/MovieProject/Add">
                <div class="form-group">
                    <label>Movie Name</label>
                    <input type="text" name="Name" class="form-control input-md">
                </div>
                <div class="form-group">
                    <label>Director</label>
                    <input type="text" name="Director" class="form-control input-md">
                </div>
                <div class="form-group">
                    <label>Actor</label>
                    <input type="text" name="Actor" class="form-control input-md">
                </div>
                <div class="form-group">
                    <label>Rating</label>
                    <input type="text" name="Rating" class="form-control input-md">
                </div>
                <div class="form-group">
                    <label>Image</label>
                    <input type="file" name="image" class="">
                </div>
                <div class="form-group">
                    <input type="submit" value="Create Movie" class="btn btn-primary btn-lg btn-block">
                </div>
            </form>  
        </div>
          </body>
</html>
