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
public class FactorialsSeries {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
         for (int i = 1; i < 10; i++) {
             System.out.println("target "+i +":" +" counter "+ sum_fac(i, 1));
  }
    }
    
    static int sum_fac(int target, int counter) {
        System.out.println("target "+target+'\n'+"counter "+counter);
    return (target == counter) ? target : counter * (1 + sum_fac(target, counter + 1));
        
}    
    
}
