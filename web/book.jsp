<%-- 
    Document   : book1
    Created on : May 5, 2017, 12:17:32 AM
    Author     : piemr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.* " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <jsp:include page="nevagitation.html" />
        <%Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","root","root");
            PreparedStatement pst=con.prepareStatement("select Name from movieinfo");
            PreparedStatement pst1=con.prepareStatement("select T_name from theater");
            ResultSet rs =pst.executeQuery();
            ResultSet rs1 =pst1.executeQuery();
            %>
    <form action="/MovieProject/Booktheater">
        <div class="col-md-4 col-md-offset-4">
            <form action="/MovieProject/Add">
                <div class="form-group">
                    <label> Movie Name</label>

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
                   <div class="form-group">
                    <label> Theater  Name</label>
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
                             <div class="form-group">
                    <label> Contact No</label>
                    <input type="text" name="contactno" class="form-control input-md">
                </div>
                
                <div class="form-group">
                    <label> Date Available</label>
                <input type="text" name="date">
                </div>
                  <div class="form-group">
                      <input type="submit" value="Book">
                      </div>
 </form>
 <%
 rs.close();
 con.close();
 %>
    </body>
</html>
