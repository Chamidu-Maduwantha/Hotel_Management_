<%-- 
    Document   : roomselection
    Created on : Jan 1, 2022, 5:37:27 PM
    Author     : bathi
--%>

<%@page import="model.datepass"%>
<%@page import="model.roomSelectBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .div1{
                width: 200px;
                height: 100px;
                border: 15px solid blue;
            }
            .div2{
                width: 200px;
                height: 100px;
                border: 15px solid blue;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> choose your room type 
         <% roomSelectBean roombean = new roomSelectBean();
            datepass datebean = new datepass();
             out.println("Checking Date" +datebean.getCheckingDate() +"   Checkout date" +datebean.getCheckoutDate());
            out.println("Standed Room Id is "+roombean.getstandardroom()+ "  your luxry room is " +roombean.getluxeroom());
         %> </h1>
        <div class="div1">
            <h3> Standed </h3>
            <button type="button" onclick="window.location.href='booking.jsp?id=1'">book</button>
        </div>
        <div class="div2">
            <h3> luxry </h3>
            <button type="button" onclick="window.location.href='booking.jsp?id=2'">book</button>
        </div>
    </body>
</html>
