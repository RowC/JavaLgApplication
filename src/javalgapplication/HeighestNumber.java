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
public class HeighestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] list = {1, 2, 20, 4, 5, 50, 7, 8, 9};
         
        //** 1 way           
//        int highest = Integer.MIN_VALUE;
//        int highest2nd = Integer.MIN_VALUE;
//        for (int i : list) {
//            if (i >= highest) {
//                highest2nd = highest;
//                highest = i;
//                 System.out.println("highest2nd "+highest2nd);
//                 System.out.println("highest "+highest);
//            } else if (i >= highest2nd) {
//                highest2nd = i;
//                 System.out.println("####### "+highest2nd);
//            }
//        }
//        System.out.println(highest2nd);
        //** 2 way    
        int largest =list[0];
        int secondLargest =list[0];
        int smallestVal =list[0];
        
        for(int i = 0;i<list.length;i++){
        if(largest<list[i]){
            largest = list[i];                
        }else if (list[i] < smallestVal)
smallestVal = list[i];

        System.out.print(list[i]+"\t");
           // System.out.println("i: "+list[i]+'\n'+stVal);
        }
        
        for (int i = 0; i < list.length; i++) {
            if (secondLargest < list[i] && largest > list[i]) {
                secondLargest = list[i];
            }
           // System.out.print(list[i]+"\t");
        }
        
        System.out.println("\n"+"The largest number in the array is " + largest); 
        System.out.println("\n"+"The second largest number in the array is " + secondLargest);      
        System.out.println("\n"+"The smallest number in the array is " + smallestVal);
    }

}
