/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */

class Difference {
  	private int[] elements;
  	public int maximumDifference = 0;

      Difference(int arr[]){
          this.elements = arr;
      }
      
      int max = 0;
      void computeDifference(){         
          for(int i =0; i<elements.length; i++){
              for(int j= 1; j<elements.length; j++){
                  max = Math.abs(elements[i]-elements[j]);
//                  System.out.println(max);
                  if(max>maximumDifference){
                      maximumDifference = max;
                  }
              }
          }
      }

	// Add your code here

} 

public class MaximumDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Difference difference = new Difference(arr);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
        
    }
}
