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
public class DuplicateWordRegex {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            System.out.println("m: "+m);
//                System.out.println("m: "+m.find());
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
//                System.out.println("m: "+m.find());
//                System.out.println("m.g: "+ m.group());
//                System.out.println("m: "+m.group(1));
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
            numSentences--;
        }
        
        in.close();
    }
}
