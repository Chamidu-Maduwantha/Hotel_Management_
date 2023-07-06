/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.deletereservation;

/**
 *
 * @author bathi
 */
public class cancelation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cancelation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cancelation at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>"); */
            
            //out.print("hi");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        //out.println("hi");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Connection con;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int bookid = Integer.valueOf(request.getParameter("book_id"));
        PrintWriter out = response.getWriter();
        
        try {
            
            deletereservation dlt = new deletereservation();
            
            out.println("hi");
            con = dbconnection.initializeDatabase();
            Statement stmt = con.createStatement();
            String query = "SELECT room_id, customer_name FROM tblreservation WHERE reservation_id='"+bookid+"';";
            ResultSet res = stmt.executeQuery(query);
            
            while(res.next())
            {
                int tblroomid = res.getInt("room_id");
                String tblcname = res.getString("customer_name");
                
                dlt.settblroomid(tblroomid);
                dlt.settblcname(tblcname);
            }
            
            response.sendRedirect("fake.jsp");
            
            
            
        }
        
        catch(ClassNotFoundException | SQLException e){
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
