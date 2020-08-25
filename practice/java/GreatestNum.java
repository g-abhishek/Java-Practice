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
public class GreatestNum {
    static void greatestNum(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};
        greatestNum(arr);
    }
    
}
