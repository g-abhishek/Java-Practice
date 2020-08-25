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
public class StringCamp {
    
    static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0, k);
        String largest = "";
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(i, i+k).compareTo(smallest)<0){
                smallest = s.substring(i, i+k);
            }
            if(s.substring(i, i+k).compareTo(largest)>0){
                largest = s.substring(i, i+k);
            }
        }
        return smallest +"\n"+ largest;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s,k));
        sc.close();
        
    }
    
}
