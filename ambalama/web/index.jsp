<%-- 
    Document   : booking
    Created on : Dec 30, 2021, 8:56:55 AM
    Author     : bathi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="roomcheck">
            <table>
                <tr>
                    <td>Checkind Date :</td>
                    <td><input type="date" name="checking"></td>
                </tr>

                <tr>
                    <td>Checkout Date :</td>
                    <td><input type="date" name="checkout"></td>
                </tr>
                
                <tr>
                    <td>Person :</td>
                    <td><input type="number" name="person"></td>
                </tr>
                

                <tr>
                    <td><input type="submit" value="search"></td>
                    <td><input type="reset" value="clear"></td>
                </tr>
            </table>
        </form>

    </body>
</html>
