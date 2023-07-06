<%-- 
    Document   : index
    Created on : Dec 28, 2021, 3:51:54 PM
    Author     : bathi
                                <tr>
                    <td>id<input type="text" name="id"></td>
                </tr>
--%>

<%@page import="model.roomSelectBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="NewServlet">
            <%  roomSelectBean roombean = new roomSelectBean();
                int jspid= Integer.valueOf(request.getParameter("id"));
                //out.println(jspid);
                       if(jspid ==1){   
                            roombean.setselectedroom(roombean.getstandardroom()); 
                       }
                        if(jspid ==2 ){
                           roombean.setselectedroom(roombean.getluxeroom()); 
                       }
                
            %>
            <table> 
                <tr>
                    <td>customer nic: </td>
                    <td><input type="text" name="cnic"> </td>
                </tr>
                
                <tr>
                    <td>customer name: </td>
                    <td> <input type="text" name="cname"></td>
                </tr>
                
                <tr>
                    <td>customer telno: </td>
                    <td><input type="text" name="mnumber"> </td>
                </tr>
                
                <tr>
                    <td> customer email:</td>
                    <td><input type="text" name="email"> </td>
                </tr>
                

   
                <tr>
                    <td><input type="reset" value="clear"></td>
                    <td> <input type="submit" value="submit"></td>
                </tr>    
                
                
            </table>
            
        </form>
             
    </body>
</html>
