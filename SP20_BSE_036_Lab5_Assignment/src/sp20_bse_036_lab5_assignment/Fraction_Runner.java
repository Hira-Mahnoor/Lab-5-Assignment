/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20_bse_036_lab5_assignment;

/**
 *
 * @author Rehman Computer
 */
public class Fraction_Runner {
     public static void main(String[] args){
        Fraction F1= new Fraction();
        F1.display();
        Fraction F2= new Fraction();
         F2.SetNum1(100);
         F2.setNum2(20);
         F2.display();
         F2.equal(F1);       //compare F2 with F1
        
        Fraction F3= new Fraction(300,100);
       
        F3.display();
        F2.display();
        F3.equal(F2);   //compare F3 with F1
   
       
}
}
