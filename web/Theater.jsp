<%-- 
    Document   : Theater
    Created on : Apr 14, 2017, 1:43:25 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Theatre Page</title>
    </head>
    <body>
        
       <center>
            <form action="/MovieProject/Addtheater">
        Theater Name            <input type="text" name="Name"><br/><br/>
         Theater Address        <input type="text" name="Address"><br/><br/>
        Theate Size             <input type="int" name="size"><br/><br/>
        Ticket cost             <input type="int" name="cost"><br/><br/>
        Theater Manager         <input type="text" name="Manager"><br/><br/>
       <input type="Submit" value="Submit">

            </form>
            </center>
    </body>
</html>
