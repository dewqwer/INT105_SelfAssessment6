/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dew2016_Wins10
 */
public class FloatingPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float myFloat=1.23456789f ;
        System.out.println("myFloat: "+myFloat);
        myFloat=12.23456789f ;
        System.out.println("myFloat: "+myFloat);
        System.out.println("----------------------------");

        float number = 1 + 1.234e-5f - 1;
        System.out.println("Cancellation Error : "+number);
        System.out.println("----------------------------");

        float highFloat = Float.MAX_VALUE;
        highFloat *= 2;
        System.out.println("Overflow : "+highFloat);
        System.out.println("----------------------------");
        
        float lowFloat = Float.MIN_VALUE;
        lowFloat /= 2;
        System.out.println("Underflow : "+lowFloat);
        System.out.println("----------------------------");
        
        float divFloat1 = 1/0f;
        float divFloat2 = 0/0f;
        float sqrtFloat = (float) Math.sqrt(-1);
        System.out.println("Value of divFloat1 : "+divFloat1);
        System.out.println("Value of divFloat2 : "+divFloat2);
        System.out.println("Value of sqrtFloat : "+sqrtFloat);
        System.out.println("----------------------------");
        
        if(divFloat1 != divFloat1){
            System.out.println("divFloat1 is NaN.");
        }else {
            System.out.println("divFloat1 is Infinity");
        }
        
        if(divFloat2 != divFloat2){
            System.out.println("divFloat2 is NaN.");
        }else {
            System.out.println("divFloat2 is Infinity");
        }
        
        if(sqrtFloat != sqrtFloat){
            System.out.println("sqrtFloat is NaN.");
        }else {
            System.out.println("sqrtFloat is Infinity");
        }
        

  }
}
           
        
   
