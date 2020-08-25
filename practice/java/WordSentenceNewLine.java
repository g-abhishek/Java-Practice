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
public class WordSentenceNewLine {
    public static void main(String[] args){
        String s = "He is a very very good boy, isn't he?";
        String[] arrOfStr = s.split("[!, ?._'@\\s]+");
        System.out.println(arrOfStr.length);
        for(String word : arrOfStr){
            System.out.println(word);
        }
    }
}
