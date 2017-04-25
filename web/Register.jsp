<%-- 
    Document   : Register
    Created on : Mar 26, 2017, 4:35:58 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
         
    </head>
    <body bgcolor="magenta">
        <center>
           <h1>Registration Form</h1>
        <form action="/MovieProject/reg">
        Username         <input type="text" name="Name"><br/><br/>
        Password         <input type="password" name="pass"><br/><br/>
        Gender           <input type="radio" name="gender" value="male">Male    <input type="radio" name="gender" value="Female">Female
        <br/><br/>
        Address          <input type="text" name="Add"><br/><br/>
        Contact No       <input type="int" name="Contact"><br/><br/>
        Emailid          <input type="text" name="Email"><br/><br/>
        <input type="submit" value="Submit">         <input type="clear" value="Clear">

</form>
        </center>
    </body>
</html>
