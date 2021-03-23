/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20_bse_036_lab5_assignment;

public class Fraction {
    private int num1;
    private int num2;
   public  double Fraction;
    public double ratio;
    
    public Fraction(){
        num1=40;
        num2=10;
        Fraction=num1/num2;
    }
    public Fraction(int n1,int n2){
        num1=n1;
        num2=n2;
        Fraction=n1/n2;
        
    }
    public void SetNum1(int num1){
        this.num1=num1;
    }
    
    public void setNum2(int num2){
        this.num2=num2;
    }
    
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    
    public boolean equal(Fraction F){
        Fraction Frac= new Fraction(F.num1,F.num2);
        ratio= F.num1/F.num2;
        
        if(ratio==Fraction){
            System.out.println("true: Equal");
            return true;
        }
        else{
            System.out.println("False: not Equal");
            return false;
        }
    }
    
    public void display(){
        if( num1>num2){
            System.out.println("Fraction= " + Fraction);
        }
        else{
            System.out.println("not possible");
        }
    }
}
