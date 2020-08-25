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
public class PasswordValidator {
    
    static final String passRegex = "^[a-zA-Z]\\w{7,29}";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        while(n>0){
            String pass = sc.nextLine();
            if(pass.matches(passRegex)){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }
            n--;
        }
    }
    
}
