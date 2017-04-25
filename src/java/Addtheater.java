/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welcome
 */
public class Addtheater extends HttpServlet {
   
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
            out.println("<title>Servlet Addtheater</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Addtheater at " + request.getContextPath () + "</h1>");
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
        String TheaterName=request.getParameter("Name");
        String TheaterAddress=request.getParameter("Address");
        String Theatersize=request.getParameter("size");
         String Ticketcost=request.getParameter("cost");

         String Theatermanager=request.getParameter("manager");

        /*File file1=request.getParameter("Image");
        InputStream inputStream = null;
        inputStream = file.getInputStream();*/



        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieuser","root","root");
            PreparedStatement pst=con.prepareStatement("insert into Movielist values(?,?,?,?)");
            pst.setString(1,TheaterName);
            pst.setString(2,TheaterAddress);
            pst.setString(3,Theatersize);
            pst.setString(4,Ticketcost);
            pst.setString(5,Theatermanager);
   int i=pst.executeUpdate();
            con.close();

    } catch(Exception e)
    {
        out.println("Exception caught"+e);
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
 throws ServletException,   IOException {
        processRequest(request, response);
                /*if(inputStream !=null)
            {
                pst.setBlob(5,inputStream);
            }*/

       
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    
    
    }
}// </editor-fold>

