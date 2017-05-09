package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<style>\n");
      out.write(".mySlides {display:none;}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"w3-container\">\n");
      out.write("  <h2>Animated Slides</h2>\n");
      out.write("  <p>Slide or fade in an element from the top, bottom, left or right of the screen with the w3-animate-* classes.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-content w3-section\" style=\"max-width:500px\">\n");
      out.write("  <img class=\"mySlides w3-animate-top\" src=\"bahubali2.jpg\" style=\"width:100%\">\n");
      out.write("  <img class=\"mySlides w3-animate-bottom\" src=\"fast.jpg\" style=\"width:100%\">\n");
      out.write("  <img class=\"mySlides w3-animate-top\" src=\"half-girlfriend.jpg\" style=\"width:100%\">\n");
      out.write("  <img class=\"mySlides w3-animate-bottom\" src=\"radta.jpg\" style=\"width:100%\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("    var i;\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    for (i = 0; i < x.length; i++) {\n");
      out.write("      x[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    myIndex++;\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("    x[myIndex-1].style.display = \"block\";  \n");
      out.write("    setTimeout(carousel, 2500);    \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
