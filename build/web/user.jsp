<%-- 
    Document   : user.jsp
    Created on : Apr 19, 2017, 4:59:11 PM
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
         <link rel="stylesheet" href="css/custom.css">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
    </head>
    <body>
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
                    <li><a href="Aboutus.jsp">Views Movie</a></li>
                    <li><a href="Contactus.jsp">View Theater</a></li>
                   
                  </ul>
                </div>
            </div>
        </nav>
    
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-xs-12 tag-movie">
                <img src="images/bahubali2.jpg" class="img-responsive movie-poster">
                <a href="#" class="btn btn-primary btn-lg btn-block" src="Bookticket.jsp">Book Now</a>
            </div>
            <div class="col-md-4 col-xs-12 tag-movie">
                <img src="images/fast.jpg" class="img-responsive movie-poster"  src="Bookticket.jsp">
                <a href="#" class="btn btn-primary btn-lg btn-block"  src="Bookticket.jsp">Book Now</a>
            </div>
            <div class="col-md-4 col-xs-12 tag-movie">
                <img src="images/half-girlfriend.jpg" class="img-responsive movie-poster">
                <a href="#" class="btn btn-primary btn-lg btn-block"  src="Bookticket.jsp">Book Now</a>
            </div>
            <div class="col-md-4 col-xs-12 tag-movie">
                <img src="images/hindimedium.jpg" class="img-responsive movie-poster">
                <a href="#" class="btn btn-primary btn-lg btn-block"  src="Bookticket.jsp">Book Now</a>
            </div>
            <div class="col-md-4 col-xs-12 tag-movie">
                <img src="images/radta.jpg" class="img-responsive movie-poster">
                <a href="#" class="btn btn-primary btn-lg btn-block"  src="Bookticket.jsp">Book Now</a>
            </div>
        </div>
    </div>
    </body>
</html>
