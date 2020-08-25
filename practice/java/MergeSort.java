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
public class MergeSort {
     void merge(int arr[], int beg, int mid, int end){
        int nL = mid-beg+1;
        int nR = end-mid;
        
        int LeftArr[] = new int[nL];
        int RightArr[] = new int[nR];
        
        for(int i=0; i<nL; ++i){
            LeftArr[i] = arr[beg+i];
        }
        
        for(int j=0; j<nR; ++j){
            RightArr[j] = arr[mid+1+j];
        }
        
        int i=0, j=0, k=beg;
        while(i<nL && j<nR){
            if(LeftArr[i] < RightArr[j]){
                arr[k] = LeftArr[i];
                i++;
            }else{
                arr[k] = RightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < nL) { 
            arr[k] = LeftArr[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < nR) { 
            arr[k] = RightArr[j]; 
            j++; 
            k++; 
        }
        
        
    }
     void sort(int arr[], int beg, int end){
        if(beg<end){
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
//            System.out.println("sort left");
            sort(arr, mid+1, end);
//            System.out.println("sort right");
            
            merge(arr, beg, mid, end);
        }
    }
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println(); 
    }
    public static void main(String[] args){
        int arr[] = {12, 11, 13, 5, 6, 7};
        MergeSort ms = new MergeSort();
        printArr(arr);
        ms.sort(arr, 0, arr.length - 1); 
        printArr(arr);
    }
}
