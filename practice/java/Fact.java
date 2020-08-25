/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

/**
 *
 * @author Abh!shek
 */
public class Fact {
    
    static int facto(int n){
        int tot=0;
        if(n==0){
            return 1;
        }else{
            return(n*facto(n-1));
        }
    }
    
    public static void main(String[] args){
        int n = 3;
        System.out.println(facto(n));
        
    }
}
