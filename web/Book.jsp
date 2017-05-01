<%-- 
    Document   : Book
    Created on : May 1, 2017, 2:27:15 AM
    Author     : piemr
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieuser","root","root");
            PreparedStatement pst=con.prepareStatement("select show time from show where theater_id=");
           
            ResultSet rs =pst.executeQuery();
           
            %>
    </body>
</html>
