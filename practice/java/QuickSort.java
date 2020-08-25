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
public class QuickSort {
    public static void main(String[] args){
        int arr[] = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        QuickSort qs = new QuickSort();
        qs.QuickSortRecurrsion(arr, 0, arr.length-1);
        printArr(arr);
    }
    void QuickSortRecurrsion(int arr[], int beg, int end){
        if(beg< end){
            int pi = partition(arr, beg, end);
            if(beg<pi){
                QuickSortRecurrsion(arr, beg, pi-1);
            }else{
                QuickSortRecurrsion(arr, pi, end);
            }
        }
    }
    int partition(int arr[], int beg, int end){
        
        int pivot = arr[(beg+end)/2];
        while(beg<=end){
            while(arr[beg]<pivot){
                beg++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(beg<=end){
                int temp = arr[beg];
                arr[beg]=arr[end];
                arr[end]=temp;
                
                beg++;
                end--;
            }
        }
        
        return beg;
    }
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println(); 
    }
}
