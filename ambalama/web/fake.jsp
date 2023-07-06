<%-- 
    Document   : fake
    Created on : Jan 7, 2022, 2:48:10 AM
    Author     : bathi
--%>

<%@page import="model.deletereservation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="cancelation" method="post">
            booking id <input type="text" name="book_id">
            <input type="submit" value="submit">
        </form>
        <form>
            Your room no is =<%  
            deletereservation dlt = new deletereservation(); 
            int i =dlt.gettblroomid();
            
            String cname = dlt.gettblcname();
            out.println(i +cname);
            %> 
        </form>
    </body>
</html>
