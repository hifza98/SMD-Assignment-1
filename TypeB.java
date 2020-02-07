/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author nas
 */
public class TypeB extends Student {
    void calculateFee()
    {
        total_fee=(course_count * course_fee);
        System.out.println("TypeB: Your due fee is "+total_fee);
    }
}
