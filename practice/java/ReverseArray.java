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
public class ReverseArray {
    
    public static void main(String[] args){
//        int arr[] = {10, 18, 15, 36, 24, 50, 38, 49};
        
        //for soreted array only
        int arr[] = {1,2,3,4,5,9};
        int beg= 0;
        int end = arr.length-1;
        while(beg<end){
            int temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            
            beg++;
            end--;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
