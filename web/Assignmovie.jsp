<%-- 
    Document   : Assignmovie
    Created on : Apr 14, 2017, 2:26:11 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head> <%Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieuser","root","root");
            PreparedStatement pst=con.prepareStatement("select Name from movieinfo");
            PreparedStatement pst1=con.prepareStatement("select T_name from theater");
            ResultSet rs =pst.executeQuery();
            ResultSet rs1 =pst1.executeQuery();
            %>
    <body>
           
            
             <div class="col-md-4 col-md-offset-4">
            <form action="/Ticketbooking/Add">
                <div class="dropdown">
  <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Dropdown Example
  <span class="caret"></span></button>
                <div class="form-group">
                    <label>Movie Name</label>
 
                      <select name="Movie_name">
                             <%
                               while(rs.next()){
                             %>
                             <option value="<%=rs.getString(1)%>"><%=rs.getString(1)%></option>
                             <%
                             }
                             %>
                             </select>
                             </div>
                             </div>
                      
                <div class="form-group">
                    <label>Theater Name</label>
                    <select name="Theatre_name">
                             <%
                               while(rs1.next()){
                             %>
                             <option value="<%=rs1.getString(1)%>"><%=rs.getString(1)%></option>
                             <%
                             }
                             %>
                             </select>
                             </div>
                  Date Available  :<input type="text" name="date">
                      <input type="submit" value="Assign">
 </form>
 <%
 rs.close();
 con.close();
 %>
 
 
 
 </body>
</html>
