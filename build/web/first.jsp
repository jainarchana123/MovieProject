<%-- 
    Document   : first
    Created on : Apr 30, 2017, 9:19:04 PM
    Author     : piemr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <jsp:include page="footer.html" />
        
          
   </body> <style>
            body {
                background-color: #90CAF9;
            }
        .topnav{
          background-color: #ffa000;
          overflow:hidden;
          }
          .topnav a{
          float:left;
          display:block;
          color: #f2f2f2;
          text-align:center;
          padding:14px 132px;
          text-decoration:none;
          font-size:17px;
          }
          .topnav a:hover{
          background-color:#ddd;
          color:black;
          }
          .topnav a,active{
          background-color:#ffe082;color:blue;
        }</style>
        <script language="java script">
            function validateform(){
            var name=document.uname.value;
            var passward=document.pass.value;
            if(name==null || name==""){
                alert("name can not be blank");
                return false;
            }
            elseif(passward.length<6)
            {
                alert("passward must be at least 6 character long");
                return false;
            }
         }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
