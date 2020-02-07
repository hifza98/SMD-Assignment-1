/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
import java.util.ArrayList;

/**
 *
 * @author nas
 */
public class Employee {
    int id;
    int pay;
    Benefits basic;
    
     Employee()
     {
         id=id++;
         basic=new Basic_Benefits();
     }
     void calculatepay()
     {
         pay=30*1000;
         System.out.println("Your pay is "+ pay);
     }
}

