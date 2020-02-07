/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.ArrayList;
/**
 *
 * @author nas
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<Student> st=new ArrayList<Student>();
       Student s1=new Student();
       Student s2=new TypeA();
       Student s3=new TypeB();
       Student s4=new TypeC();
       st.add(s1);
       st.add(s2);
       st.add(s3);
       st.add(s4);
       for(int i=0;i<st.size();i++)
       {
           st.get(i).calculateFee();
       }
    }
    
}
