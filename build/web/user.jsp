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
          padding:14px 130px;
          text-decoration:none;
          font-size:17px;
          }
          .topnav a:hover{
          background-color:#ddd;
          color:black;
          }
          .topnav a,active{
          background-color:#4caf50;color:white;
        }</style>
    </head>
    <body>
 <div class="topnav" id="mytopnav">
        <a href="user.jsp"><b>Home</b></a>
        <a href="book.jsp"><b>Theatres</b></a>
        <a href="cancle.jsp"><b>Assign Movies</b></a>
        <a href="Logout.jsp"><b>Log Out</b></a>
        </div>

    </body>
</html>
