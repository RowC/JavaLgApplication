/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalgapplication;

/**
 *
 * @author rowshon.chowdhoury
 */
public class FactorialRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int result = 5;
      
        System.out.println("Factorials of the number is "+ factorial(result));
    }
    
    static int factorial(int n){        
        if(n==0){
            return 1;
        }else{
        return n * factorial(n - 1);
        }
   // return result;
    }
}
