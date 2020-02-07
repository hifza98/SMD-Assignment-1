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
public class Creature {
    int id;
    Creature()
    {
        id=id++;
    }
    void Breathe()
    {
        System.out.println("I am a creature so I can Breathe");
    }
    void EatFood()
    {
        System.out.println("I am a creature so I can eat food");
    }
}
