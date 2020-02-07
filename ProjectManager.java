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
public class ProjectManager extends Employee {
    Benefits managerBenefits;
    Benefits developerBenefits;
    
    ProjectManager()
    {
        managerBenefits=new Manager_Benefits();
        developerBenefits=new Developer_Benefits();
    }
    @Override
    void calculatepay()
     {
         pay=30*5000;
          System.out.println("Your pay is "+ pay);
     }
}
