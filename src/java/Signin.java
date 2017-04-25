/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welcome
 */
public class Signin extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Signin</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Signin at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
                PrintWriter out=response.getWriter();
              String name = request.getParameter("uname");
         String pass = request.getParameter("pass");


        try{

            Class.forName("com.mysql.jdbc.Driver");
        
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieuser","root","root");
         	Statement ps=con.createStatement();
            String s="select * from userlist where Name='"+name+"' and Password='"+pass+"' ";

           
         	ResultSet rs=ps.executeQuery(s);
            if(name.equals("Archana") && pass.equals("archana1996"))
            {
                response.sendRedirect("AdminHome.jsp");
            }
            int count=0;
             while(rs.next())
             {
                 count++;
             }
             if(count>0)
           {
                 RequestDispatcher rd = request.getRequestDispatcher("Userhome.jsp");
                 rd.forward(request,response);
           }
             else
             {
                out.print("incorrect passsword");
                response.sendRedirect("index.jsp");
             }
                  con.close();
             
        }catch(Exception e2){
          out.print("<br/>exception caught" +e2);

        }
        out.close();
    }


    

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
