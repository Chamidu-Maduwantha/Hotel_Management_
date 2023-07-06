/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class roomSelectBean implements java.io.Serializable{
    
    public static int standardroom; 
    public static int luxeroom; 
    public static int selectedroom; 
    
    public roomSelectBean(){}
    
    public void setstandardroom(int standardroom){
    roomSelectBean.standardroom = standardroom; 
    }
    public int getstandardroom(){
    return standardroom; 
    }
    
    public void setluxeroom(int luxeroom){
    roomSelectBean.luxeroom = luxeroom; 
    }
    public int getluxeroom(){
    return luxeroom; 
    }
    
    public void setselectedroom(int selectedroom){
    roomSelectBean.selectedroom = selectedroom; 
    }
    public int getselectedroom()
    {
    return selectedroom; 
    }
}
