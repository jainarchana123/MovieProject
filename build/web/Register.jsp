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
        <style>
            body {
                background-image: url('images/multiplex.jpg')
            }
        </style>
    </head>
    <body bgcolor="magenta">
        <jsp:include page="nevagitation.html" />
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-primary">
                    <div class="panel-heading">
                      <h3 class="panel-title">Registration FOrm</h3>
                    </div>
                    <div class="panel-body">
                    <form action="/MovieProject/Add">
                        <div class="form-group">
                            <label>First Name</label>
                            <input type="text" name="fname" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <label>Last Name</label>
                            <input type="text" name="lname" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <input type="email" name="email" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" name="pwd" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <label>Password Confirm</label>
                            <input type="password" name="pwd-confirm" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <label>Contact Number</label>
                            <input type="text" name="contactno" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <label>Address</label>
                            <input type="text" name="address" class="form-control input-md">
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Register Now" class="btn btn-primary btn-lg btn-block">
                        </div>
                        <div class="form-group">
                            <input type="reset" value="Reset Form" class="btn btn-primary btn-lg btn-block">
                        </div>
                    </form> 
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.html" />
    </body>
</html>
