/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalgapplication;

import java.util.List;

/**
 *
 * @author rowshon.chowdhoury
 */
public class JavaLgApplication {

    /**
     * @param args the command line arguments
     */
    public static int rcTotal(List<Integer> list,int sum){
        
    return 0;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        System.out.println(powerN(2, i));
    }
        
         //int n = 5;
//       int result = 1;
//       for (int i = 1; i <= 7; i++) {
//           result = result * i;
//       }
//       System.out.println("The factorial of the number  is " + result);

int n = 7;
       int result = factorial(n);
       System.out.println("The factorial of 7 is " + result);
    }
    public static int powerN(int base, int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Illegal Power Argument");
    }
    if (n == 0) {
        return 1;
    } else {
        return base * powerN(base, n - 1);
    }
}
    
    
    public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
}
