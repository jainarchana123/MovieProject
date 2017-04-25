<%-- 
    Document   : Contactus
    Created on : Mar 26, 2017, 4:34:48 PM
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
        <jsp:include page="nevagitation.html" />
        <div class="container">
            <div class="well">
                <h1>for any queries please contact................................</h1>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <form method="post" action="/">
                        <div class="form-group">
                             <label>Name</label>
                             <input type="text" name="Name" class="form-control input-lg">
                         </div>
                         <div class="form-group">
                             <label>Email</label>
                             <input type="email" name="Email" class="form-control input-lg">
                         </div>
                         <div class="form-group">
                             <label>Your Message</label>
                             <textarea class="form-control input-lg"></textarea>
                         </div>
                        <div class="form-group">
                            <input type="submit" value="Submit" class="btn btn-primary btn-lg btn-block">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <jsp:include page="footer.html" />
    </body>
</html>
