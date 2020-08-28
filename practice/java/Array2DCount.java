/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */
public class Array2DCount {
    
    static int count(int arr[][], int R, int C){
        if(R<3 || C<3){         // (R-2)*(C-2) = no. of hour glass
            return -1;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<R-2;i++){
            for(int j=0; j<C-2; j++){
                sum  = (arr[i][j] + arr[i][j+1] + arr[i][j+2])   // hour glass is made of 7 cells
                            + (arr[i+1][j+1]) + 
                        (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
//                System.out.println(sum);
                if(sum>max){
                    max = sum;
                }
            }
        }
        
        return max;
    }
    
    public static void main(String[] args){
        int R = 6, C = 6;
        int[][] arr = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
                        };
//        Scanner sc = new Scanner(System.in);
//        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        for(int i=0; i<6; i++){
//            for(int j=0; j<6; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
        
        for (int i = 0; i < 6; i++) { 
            for (int j = 0; j < 6; j++) { 
                System.out.print(arr[i][j] + " "); 
            }   
            System.out.println(); 
        }
        
        System.out.println(count(arr, R, C));
    }
}
