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
public class StringEvenOdd {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1,s2;
        for(int i=0;i<n;i++){
            String s= sc.next();
            for(int j =0; j< s.length(); j=j+2){
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int j =1; j< s.length(); j=j+2){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
