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
public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {36, 19, 29, 12, 5};
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){
//                System.out.print(arr[j+1]);
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //sorted
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        
        }
        //reverse sorted
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        
        }
    }
}
