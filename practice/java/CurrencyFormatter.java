/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */
public class CurrencyFormatter {
    
    static String formatCurrency(double dbl, Locale locale){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        
        System.out.println(formatter.format(dbl));
        return "formatter";
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double dbl = sc.nextDouble();
        String us = formatCurrency(dbl, Locale.US);
        String in = formatCurrency(dbl, new Locale("en","IN"));
        String china = formatCurrency(dbl, Locale.CHINA);
        String france = formatCurrency(dbl, Locale.FRANCE);
        
        System.out.println("US: " + us);
        
        
    }
    
}
