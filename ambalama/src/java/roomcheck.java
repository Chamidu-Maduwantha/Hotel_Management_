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
public class roomcheck extends HttpServlet {

Connection connection;

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            
        try
        {
           
            PrintWriter out = response.getWriter();
            
            //user enterd value in jsp
            int enterPersonCount = Integer.valueOf(request.getParameter("person"));
            String usercheckin = request.getParameter("checking");
            String usercheckout = request.getParameter("checkout");
            
            if(enterPersonCount== 1){enterPersonCount=2;}
            if(enterPersonCount== 3){enterPersonCount=4;}
            if(enterPersonCount== 5){enterPersonCount=6;}
            
            //out.println(enterPersonCount);
            connection = dbconnection.initializeDatabase();
            
            Statement stmt = connection.createStatement(); 
            String query = "SELECT room_id,person FROM tblroom WHERE\n" +
                            "room_id NOT IN (SELECT room_id FROM tblreservation \n" +
                            "WHERE (check_in BETWEEN '"+usercheckin+"' AND '"+usercheckout+"') OR (check_out BETWEEN '"+usercheckin+"' AND '"+usercheckout+"'));";
            ResultSet rs = stmt.executeQuery(query);
            
                //sessions
             HttpSession enterperson_session = request.getSession(true);
             enterperson_session.putValue("enterperson_session",enterPersonCount);
             
             
            int stand_count = 0;
            int luxe_count = 0;
            
            //beans
            datepass datebean = new datepass();
            roomSelectBean roombean = new roomSelectBean();
            
            datebean.setCheckingDate(usercheckin);
            datebean.setCheckoutDate(usercheckout);
            
            while(rs.next())
            { 
                int tblperson = rs.getInt("person");
                int tblroom_id = rs.getInt("room_id");
                
                if(tblperson == enterPersonCount)
                {
                    if(((tblroom_id > 100 && tblroom_id < 200) || (tblroom_id>300 && tblroom_id<400) || (tblroom_id>500 && tblroom_id<600)))
                    {
                        //out.print("standed room" +tblroom_id);
                        stand_count++;
                        roombean.setstandardroom(tblroom_id); 
                        
                    }
                    else if((!(tblroom_id> 100 && tblroom_id<200) || (tblroom_id>300 && tblroom_id<400) || (tblroom_id>500 && tblroom_id<600))) 
                    {
                        //out.print("Luxry room" +tblroom_id); 
                        luxe_count++;
                        roombean.setluxeroom(tblroom_id);
                        
                    }
                    else if(stand_count ==1 && luxe_count==1) {break;}   
                }
            }
            response.sendRedirect(request.getContextPath()+ "/roomselection.jsp"); 
        }
        
        catch (SQLException | ClassNotFoundException ex) 
        {
            Logger.getLogger(roomcheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

  