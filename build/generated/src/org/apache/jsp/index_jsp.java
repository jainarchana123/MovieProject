package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>First Page</title>\n");
      out.write("        <img src=\"/MovieProject/movie.jpg\">\n");
      out.write("            <style>\n");
      out.write("        .topnav{\n");
      out.write("          background-color: #ffa000;\n");
      out.write("          overflow:hidden;\n");
      out.write("          }\n");
      out.write("          .topnav a{\n");
      out.write("          float:left;\n");
      out.write("          display:block;\n");
      out.write("          color: #f2f2f2;\n");
      out.write("          text-align:center;\n");
      out.write("          padding:14px 130px;\n");
      out.write("          text-decoration:none;\n");
      out.write("          font-size:17px;\n");
      out.write("          }\n");
      out.write("          .topnav a:hover{\n");
      out.write("          background-color:#ddd;\n");
      out.write("          color:black;\n");
      out.write("          }\n");
      out.write("          .topnav a,active{\n");
      out.write("          background-color:#ffe082;color:blue;\n");
      out.write("        }</style>\n");
      out.write("        <script language=\"java script\">\n");
      out.write("            function validateform(){\n");
      out.write("            var name=document.uname.value;\n");
      out.write("            var passward=document.pass.value;\n");
      out.write("            if(name==null || name==\"\"){\n");
      out.write("                alert(\"name can not be blank\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            elseif(passward.length<6)\n");
      out.write("            {\n");
      out.write("                alert(\"passward must be at least 6 character long\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("         }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"magenta\">\n");
      out.write("        <h2><b>Movies World</b></h2>\n");
      out.write("        <div class=\"topnav\" id=\"mytopnav\">\n");
      out.write("        <a href=\"index.jsp\"><b>Home</b></a><a href=\"Aboutus.jsp\"><b>Aboutus</b></a>\n");
      out.write("          <a href=\"Contactus.jsp\"><b>Contact us</b></a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write(" <br/>\n");
      out.write("\n");
      out.write("          <form action=\"/MovieProject/Signin\" method=\"get\"onsubmit=\"return validateform()\">\n");
      out.write("          \n");
      out.write("         Username : <input type=\"text\" name=\"uname\"><br/>\n");
      out.write("         Password :  <input type=\"password\" name=\"pass\"><br/>\n");
      out.write("         <input type=\"submit\" value=\"signin\"><br/>\n");
      out.write("         <a href=\"Register.jsp\">Register</a>\n");
      out.write("         </form>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("          \n");
      out.write("          \n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
