/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;
import java.util.ArrayList;
/**
 *
 * @author nas
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Creature> creatures=new ArrayList<Creature>();
        Creature c1=new Creature();
        Creature c2=new Bird();
        Creature c3=new Rabbit();
        Creature c4=new Dog();
        creatures.add(c1);
        creatures.add(c2);
        creatures.add(c3);
        creatures.add(c4);
    }
    
}
