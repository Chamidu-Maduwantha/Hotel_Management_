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
public class datepass implements java.io.Serializable {
    
    public static String ChechingDate;
    public static String CheckoutDate;
    
    public datepass(){}
    
    public void setCheckingDate(String CheckingDate1){
        datepass.ChechingDate= CheckingDate1;
    }
    
    public String getCheckingDate()
    {
        return ChechingDate;
    }
    
    public void setCheckoutDate(String CheckoutDate1){
        datepass.CheckoutDate= CheckoutDate1;
    }
    
    public String getCheckoutDate(){
        return CheckoutDate;
    }
}
