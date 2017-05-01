<%-- 
    Document   : Aboutus.jsp
    Created on : Mar 26, 2017, 4:33:25 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="nevagitation.html" />
        <div class="container">
            <div class="jumbotron text-center">
                <h2>Our Story</h2>
            </div>
            <p>
                Online Movie Ticket Booking System is a website to provide the customers facility to book
                tickets for a movie online and to gather information about the movies and theatres .
                Customer need to register at the site to book tickets to the movie. After sewlecting
                the show,the user is presented a seating layout so that he can select seats of his choice
                . Thereafter he is redirected to the payment gateway for making a tranction.
                User can update his profile,take a printout of the ticket and also view his booking history.
                ticket
            </p>
        </div>
        <jsp:include page="footer.html" />
    </body>
</html>
