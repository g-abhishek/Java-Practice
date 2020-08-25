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
public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {5, 19, 29, 12, 36};
        for(int i=0; i<arr.length; i++){
            int min_idx = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            System.out.println(arr[min_idx]);
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            
            
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        
        }
    }
}
