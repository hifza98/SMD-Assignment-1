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
public class SoftwareDeveloper extends Employee {
    Benefits devBenefits;
    SoftwareDeveloper()
    {
        devBenefits=new Developer_Benefits();
    }
    void calculatepay()
     {
         pay=30*3000;
         System.out.println("Your pay is "+ pay);
     }
}
