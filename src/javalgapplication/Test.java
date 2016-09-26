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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 100;
        int total = a + b,
                reverse = 0;
        System.out.println("Total = " + total);
        while (total != 0) {
            reverse = reverse * 10;
            reverse = reverse + total % 10;
            total = total / 10;
        }
        System.out.println("Reverse of entered number is " + reverse);
    }

}
