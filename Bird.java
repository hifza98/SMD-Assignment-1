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
public class Bird extends Walking_Creatures{
    Tricks learnt;
    Bird()
    {
        learnt=new Pet_Bird();
    }
    void fly()
    {
        System.out.println("I am a bird so I can fly");
    }
    void makeNest()
    {
        System.out.println("I am a bird so I can make nest");
    }
    void walk()
    {
        System.out.println("I am a bird so I can walk");
    }
}
