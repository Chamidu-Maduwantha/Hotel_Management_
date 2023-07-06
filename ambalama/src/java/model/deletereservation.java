/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bathi
 */
public class deletereservation implements java.io.Serializable {
    
    public static int roomid;
    public static String cname;
    
    public deletereservation(){}
    
    public void settblroomid(int roomid)
    {
        deletereservation.roomid= roomid;
    }
    
    public int gettblroomid()
    {
        return roomid;
    }
    
    public void settblcname(String cname)
    {
        deletereservation.cname = cname;
    }
    
    public String gettblcname()
    {
        return cname;
    }
}
