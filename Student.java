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
public class Student {
    int id;
    int course_count;
    double course_fee;
    double total_fee;
    Student()
    {
        id=id++;
        course_count=5;
        course_fee=7500;
    }
    void calculateFee()
    {
        total_fee=course_count*course_fee;
        System.out.println("Your due fee is "+total_fee);

    }
    
}
