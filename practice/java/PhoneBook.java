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
public class PhoneBook {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> phnBookMap = new HashMap<String, Integer>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            phnBookMap.put(name, number);
        }
        System.out.println(phnBookMap);
        while(sc.hasNext()){
            String name = sc.nextLine();
            if(phnBookMap.containsKey(name)){
                System.out.println(name+"="+phnBookMap.get(name));
            }else{
                System.out.println("not found");
            }
        }
        sc.close();
        
    }
    
}
