/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.datepass;
import model.roomSelectBean;

/**
 *
 * @author bathi
 */
public class NewServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bookservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bookservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Connection con;
    PreparedStatement st;
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        try {
            // Initialize the database
            con = dbconnection.initializeDatabase();
            
                        //bean
            roomSelectBean roombean = new roomSelectBean(); 
            datepass datebean = new datepass();
            
            //pass the values of beans to the variables
            int roomno = roombean.getselectedroom(); 
            String checkingdate = datebean.getCheckingDate();
            String Checkoutdate = datebean.getCheckoutDate();
            
            PrintWriter out = response.getWriter();
            
            //create variables
            //int id =Integer.valueOf(request.getParameter("id"));
            String ucustomer_name = request.getParameter("cname");
            String ucustomer_nic=request.getParameter("cnic");
            int ucustomer_telno= Integer.valueOf(request.getParameter("mnumber"));
            String ucustomer_email = request.getParameter("email");
            
            //out.print("id "+id+"roomid "+uroom_id+"name "+ucustomer_name+"nic "+ucustomer_nic+"telno "+ucustomer_telno+ucustomer_email+ucheck_in+uchech_out);
            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            //reservation_id,room_id,customer_name,customer_nic,customer_telno,customer_email,check_in,check_out
         
            st = con.prepareStatement("insert into tblreservation(room_id,customer_name,customer_nic,customer_telno,customer_email,check_in,check_out) values('"+roomno+"','"+ucustomer_name+"','"+ucustomer_nic+"','"+ucustomer_telno+"','"+ucustomer_email+"','"+checkingdate+"','"+Checkoutdate+"')");
  
            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer

            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();
  
            // Close all the connections
            st.close();
            con.close();
  
            // Get a writer pointer 
            // to display the successful result
            out.println("<html><body><b> data giya </b></body></html>"); 
        }
        catch (IOException | NumberFormatException e) {
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
