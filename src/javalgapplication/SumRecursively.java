/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalgapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rowshon.chowdhoury
 */
public class SumRecursively {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //print the sum in here 
        System.out.println(sumListRecursive(numbers,0));
    }
    public static int sumListRecursive(List<Integer> numbers,int n) {
        if (numbers.isEmpty() == true ) {
            return 0;
        }
        else {
            /* removed the print statement from here as it prints each time the function is called and else is executed. */
            return numbers.get(0) + sumListRecursive(numbers.subList(1, numbers.size()),n++);
        }
    }
}
