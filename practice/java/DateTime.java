/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Abh!shek
 */
public class DateTime {
    
    public static void main(String[] args){
        LocalDate d = LocalDate.of(2020,8,19);
        System.out.println(d.getDayOfWeek());
    }
    
}
