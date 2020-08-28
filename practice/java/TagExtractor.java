/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Abh!shek
 */
public class TagExtractor {
    public static void main(String[] args){
       String regex = "<(.+)>([^<]+)</\\1>";
       Scanner sc = new Scanner(System.in);
       int testCases = sc.nextInt();
       sc.nextLine();
       while(testCases>0){
           String str = sc.nextLine();
           boolean matchFound = false;
           
           Pattern p = Pattern.compile(regex);
           Matcher matcher = p.matcher(str);
            while(matcher.find()){
                System.out.println(matcher.group(0));
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if(!matchFound){
                System.out.println("None");
            }
           
           testCases--;
       }
    }
}
