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
public class PalindromNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
      System.out.println("@@@ "+r);
   sum=(sum*10)+r;    
    System.out.println("+++ "+sum);
   n=n/10; 
 System.out.println("!!! "+n);   
  }    
  if(temp==sum)    
   System.out.println(temp + " Is a palindrome number ");    
  else    
   System.out.println(temp +" Is not a palindrome");    
}  
    
    
}
