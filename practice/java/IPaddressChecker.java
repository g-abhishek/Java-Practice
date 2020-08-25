/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Abh!shek
 */
public class IPaddressChecker {
    public static boolean isValid(String ip){
        if(ip == null){
            return false;
        }
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String IpRegex = zeroTo255+"."+zeroTo255+"."+zeroTo255+"."+zeroTo255;
        Pattern p = Pattern.compile(IpRegex);
        Matcher m = p.matcher(ip);
        return m.matches();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        System.out.println(isValid(ip));
    }
}
