/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */
public class phoneBook2 {
    public static void main(String[] args){
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int no = sc.nextInt();
            phoneBook.put(s, no);
        }
        System.out.println(phoneBook);
        while(sc.hasNext()){
            String name = sc.next();
            if(phoneBook.get(name)==null){
                System.out.println("Not found");
            }else{
                System.out.println(name+"="+phoneBook.get(name));
            }
            
        }
        sc.close();
    }
    
}
