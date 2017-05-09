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
         <script type="text/javascript" src="js/bootstrap.js"></script>
    </head>
    <body bgcolor="lightgrey">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand" href="index.jsp">BookMovies</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                  <ul class="nav navbar-nav">
                    <li class=""><a href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
                    <li><a href="Add.jsp">Movies</a></li>
                    <li><a href="Adtheater.jsp">Theaters</a></li>
                    <li><a href="Sign.jsp">Assign Movie</a></li>
                     <li><a href="sign.jsp">Admin Home</a></li>
                      <li><a href="sign.jsp">Log Out</a></li>
                  </ul>
                </div>
            </div>
        </nav>
        
        <div class="well text-center">
            <h2>Add New Movie</h2>
        </div>
        <div class="col-md-4 col-md-offset-4">
            <form action="/MovieProject/Add" method="post">
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
