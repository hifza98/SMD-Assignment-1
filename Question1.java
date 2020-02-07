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
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employees=new ArrayList<>();
        Employee e1=new Employee();
        Employee e2=new Intern();
        Employee e3=new SoftwareDeveloper();
        Employee e4=new ProjectManager();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        for(int i=0;i<employees.size();i++)
        {
            employees.get(i).calculatepay();
        }
    }
    
}
