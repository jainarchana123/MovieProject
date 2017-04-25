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
    </head>
    <body>
        <center>
            <form action="/MovieProject/Add">
        Movie Name    <input type="text" name="Name"><br/><br/>
        Director      <input type="text" name="Director"><br/><br/>
        Actor         <input type="text" name="Actor"><br/><br/>
        Rating        <input type="int" name="Rating"><br/><br/>
        Image         <input type="file" name="Image"><input type="button" value="Browse"><br/><br/>
        <input type="submit" value="Add">
            
            </form>  
            </center>
          </body>
</html>
