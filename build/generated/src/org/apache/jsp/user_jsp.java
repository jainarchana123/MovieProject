package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write(" <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                  </button>\r\n");
      out.write("                  <a class=\"navbar-brand\" href=\"index.jsp\">BookMovies</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                  <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"\"><a href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                    <li><a href=\"Aboutus.jsp\">Views Movie</a></li>\r\n");
      out.write("                    <li><a href=\"Contactus.jsp\">View Theater</a></li>\r\n");
      out.write("                   \r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 col-xs-12 tag-movie\">\r\n");
      out.write("                <img src=\"images/bahubali2.jpg\" class=\"img-responsive movie-poster\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg btn-block\">Book Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-xs-12 tag-movie\">\r\n");
      out.write("                <img src=\"images/fast.jpg\" class=\"img-responsive movie-poster\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg btn-block\">Book Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-xs-12 tag-movie\">\r\n");
      out.write("                <img src=\"images/half-girlfriend.jpg\" class=\"img-responsive movie-poster\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg btn-block\">Book Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-xs-12 tag-movie\">\r\n");
      out.write("                <img src=\"images/hindimedium.jpg\" class=\"img-responsive movie-poster\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg btn-block\">Book Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-xs-12 tag-movie\">\r\n");
      out.write("                <img src=\"images/radta.jpg\" class=\"img-responsive movie-poster\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg btn-block\">Book Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
