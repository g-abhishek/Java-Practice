/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */
public class BinaryNumbers {
    
//    If we keep doing this operation in a loop, we end up with x = 0. 
//            The number of iterations required to reach 0 is actually length of the longest consecutive sequence of 1s.
            
    static void numOfOnes(int n){
        int count = 0;
        while (n!=0) 
        { 
            // This operation reduces length 
            // of every sequence of 1s by one. 
            n = (n & (n << 1)); 
  
            count++; 
        } 
        System.out.println("val "+count);
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //decimal num
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);
        numOfOnes(n);
        
        ///222 = 11011110 t=4 s=2
        int rem, s=0, t=0;
        while(n>0){
            rem = n%2;
            if(rem == 1){
                s++;
                if(s>=t){
                     t=s; 
                }
               
            }else{
                    s=0;
                }
            n=n/2;
        }
        System.out.println("count: "+t);
    }
    
}
