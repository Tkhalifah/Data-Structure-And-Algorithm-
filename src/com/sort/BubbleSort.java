/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sort;
   
/**
 *
 * @author hp
 */
public class BubbleSort {
    static void BubbleSorting(int []arr){
       for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        } 
    }
    public static void main(String[] args) {
        int [] arr={8,6,1,5,3,2,0,7,9};
        BubbleSorting(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
        }
    }
}
