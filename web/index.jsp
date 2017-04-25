<%-- 
    Document   : index
    Created on : Mar 26, 2017, 4:19:01 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>First Page</title>
        <style>
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
    <body bgcolor:="yellow" >
        <jsp:include page="nevagitation.html" />
        <h2><b>Movies World</b></h2>
        <div class="topnav" id="mytopnav">
            <a href="index.jsp"><b>Home</b></a>
            <a href="Aboutus.jsp"><b>Aboutus</b></a>
            <a href="Contactus.jsp"><b>Contact us</b></a>
            <a href="SignIn.jsp"><b>Sign In</b></a>
        </div>

          <form action="/MovieProject/Signin" method="get"onsubmit="return validateform()">
          
         Username : <input type="text" name="uname"><br/>
         Password :  <input type="password" name="pass"><br/>
         <input type="submit" value="signin"><br/>
         <a href="Register.jsp">Register</a>
         </form>
         
         
          
          
        <jsp:include page="footer.html" />
   </body>




 </html>
