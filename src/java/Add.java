/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.mail.Part;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welcome
 */
public class Add extends HttpServlet {
   
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
            out.println("<title>Servlet Add</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Add at " + request.getContextPath () + "</h1>");
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
        String MovieName=request.getParameter("Name");
        String Director=request.getParameter("Director");
        String Actor=request.getParameter("Actor");
        String rating=request.getParameter("Rating");
        String strpath=request.getParameter("Image");
        String filepath=strpath.substring(strpath.lastIndexOf("//"+1));
        File imgfile=new File(strpath);
        FileInputStream fin=new FileInputStream(imgfile);

        /*File file1=request.getParameter("Image");
        InputStream inputStream = null;
        inputStream = file.getInputStream();*/



        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieuser","root","root");
            PreparedStatement pst=con.prepareStatement("insert into Movielist values(?,?,?,?)");
            pst.setString(1,MovieName);
            pst.setString(2,Director);
            pst.setString(3,Actor);
            pst.setString(4,rating);
            pst.setLong(5,imgfile.length());
            /*if(inputStream !=null)
            {
                pst.setBlob(5,inputStream);
            }*/
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
