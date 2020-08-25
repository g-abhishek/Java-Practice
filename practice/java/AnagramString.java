/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */
public class AnagramString {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean ret = Anagrams(a, b);
        System.out.print(ret ? "Anagrams" : "Not Anagrams");
        
    }

    private static boolean Anagrams(String a, String b) {
        
        if(a.length() != b.length()){
            return false;
        }
        
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int[] freq = new int[26];
        char e = 'b';
        System.out.println((int)e-97);
        for(char c : charsA){
            freq[(int)c-97]++;
        }
        System.out.println(freq);
        for(char c : charsB){
            freq[(int)c-97]--;
        }
        System.out.println(freq);
        for(int i : freq){
            if(i!=0){
                return false;
            }
        }
//        Arrays.sort(charsA);   //it also works o(nlogn)
//        Arrays.sort(charsB);
        
//        String sortedA = new String(charsA);
//        String sortedB = new String(charsB);
//        
//        for(int i=0; i<a.length(); i++){
//            if(sortedA.charAt(i) != sortedB.charAt(i)){
//                return false;
//            }
//        }
        
        return true;
    }
    
}
