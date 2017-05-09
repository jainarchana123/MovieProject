<%-- 
    Document   : Bookticket
    Created on : May 5, 2017, 12:17:32 AM
    Author     : piemr
--%>


<%@page import="java.sql.Array"%>
<%@page pageEncoding="UTF-8"%>
<%@page import= "java.sql.*" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String [] rowArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"};
int r;
int[] seatsarray=new int[16];
int i,count=1;
for( i=0;i<16;i++)
{
  seatsarray[i]=count;
count++;  
}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="nevagitation.html" />
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                </div>
                <div class="col-md-6">
                     <div class="well">
                         <h1 class="text-center">Book your Ticket Now </h1>
                     </div>
                    <% for(r = 0; r < rowArray.length; r++){%>
                        <div class="seating-rows">
                            <%
                                out.print(rowArray[r]);   
                            %>
                        </div>
                        <% for(i = 0; i < seatsarray.length; i+=1) { %>
                        <div class="seatings">  
                                <%
                                    out.print(seatsarray[i] + "<br>");
                                %>
                            </div>
                        <% } %>
                   <% } %>
                   <h4 class="text-center"><strong>All EYES THIS WAY PLEASE</strong></h4>
                </div>
                <div class="col-md-3">
                </div>
            </div>
        </div>
    <jsp:include page="footer.html" />
    </body>
</html>
