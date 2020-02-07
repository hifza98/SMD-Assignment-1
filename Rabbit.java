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
public class Rabbit extends Creature {
    Tricks learnt;
    Rabbit()
    {
        learnt=new Pet_Rabbit();
    }  
    void hop()
    {
        System.out.println("I am a Rabbit so I can hop");
    }
}
