/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Abh!shek
 */
public class ArrayRotation {
    
    static void rotate(int arr[],int d,int n){     // O(n*d)
        for(int i=0; i<d; i++){
            int j;
            int temp = arr[0];
            for(j=0; j<n-1;j++){
                
                arr[j] = arr[j+1];
                System.out.print(arr[j]+ " ");
            }
            arr[j] = temp;
        }
        System.out.println();
    }   
    
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        rotate(arr, d, n);
        System.out.println(Arrays.toString(arr));
    }
}
