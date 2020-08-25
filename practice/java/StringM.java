/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;
import java.util.*;
import java.io.*;

/**
 *
 * @author Abh!shek
 */
public class StringM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(A.length()+B.length());
        int lexo = A.compareTo(B);
        if(lexo>=0){
            System.out.println("Yes");
        }else if(lexo<0){
            System.out.println("No");
        }
        A=A.substring(0,1).toUpperCase()+A.substring(1);
        B=B.substring(0,1).toUpperCase()+B.substring(1); 
       System.out.println(A+" "+B);
    }
}
