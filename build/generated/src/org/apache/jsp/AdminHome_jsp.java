package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/Movie.jsp");
    _jspx_dependants.add("/Theater.jsp");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        .topnav{\n");
      out.write("          background-color: #333;\n");
      out.write("          overflow:hidden;\n");
      out.write("          }\n");
      out.write("          .topnav a{\n");
      out.write("          float:left;\n");
      out.write("          display:block;\n");
      out.write("          color: #f2f2f2;\n");
      out.write("          text-align:center;\n");
      out.write("          padding:14px 48.3px;\n");
      out.write("          text-decoration:none;\n");
      out.write("          font-size:17px;\n");
      out.write("          }\n");
      out.write("          .topnav a:hover{\n");
      out.write("          background-color:#ddd;\n");
      out.write("          color:black;\n");
      out.write("          }\n");
      out.write("          .topnav a,active{\n");
      out.write("          background-color:#4caf50;color:white;\n");
      out.write("        }</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <body bgcolor=\"lightgrey\">\n");
      out.write("        <h2><b>Movies World</b></h2>\n");
      out.write("        <div class=\"topnav\" id=\"mytopnav\">\n");
      out.write("        <a href=\"index.jsp\"><b>Home</b></a>\n");
      out.write("        <a href=\"");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <form action=\"/MovieProject/Add\">\n");
      out.write("        Movie Name    <input type=\"text\" name=\"Name\"><br/><br/>\n");
      out.write("        Director      <input type=\"text\" name=\"Director\"><br/><br/>\n");
      out.write("        Actor         <input type=\"text\" name=\"Actor\"><br/><br/>\n");
      out.write("        Rating        <input type=\"int\" name=\"Rating\"><br/><br/>\n");
      out.write("        Image         <input type=\"file\" name=\"Image\"><input type=\"button\" value=\"Browse\"><br/><br/>\n");
      out.write("        <input type=\"submit\" value=\"Add\">\n");
      out.write("            \n");
      out.write("            </form>  \n");
      out.write("            </center>\n");
      out.write("          </body>\n");
      out.write("</html>\n");
      out.write("\"><b>Movies</b></a>\n");
      out.write("        <a href=\"");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Theatre Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <center>\n");
      out.write("            <form action=\"/MovieProject/Addtheater\">\n");
      out.write("        Theater Name            <input type=\"text\" name=\"Name\"><br/><br/>\n");
      out.write("         Theater Address        <input type=\"text\" name=\"Address\"><br/><br/>\n");
      out.write("        Theate Size             <input type=\"int\" name=\"size\"><br/><br/>\n");
      out.write("        Ticket cost             <input type=\"int\" name=\"cost\"><br/><br/>\n");
      out.write("        Theater Manager         <input type=\"text\" name=\"Manager\"><br/><br/>\n");
      out.write("       <input type=\"Submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\"><b>Theatres</b></a>\n");
      out.write("        <a href=\"Am.jsp\"><b>Assign Movies</b></a>\n");
      out.write("        <a href=\"home.jsp\"><b>Admin Home</b></a>\n");
      out.write("        <a href=\"Logout.jsp\"><b>Log Out</b></a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
