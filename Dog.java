/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author nas
 */
public class Dog extends Walking_Creatures {
    Tricks learnt;
    Dog()
    {
        learnt=new Pet_Dog();
    }
    void walk()
    {
        System.out.println("I am a Dog so I can walk");
    }
    
}
