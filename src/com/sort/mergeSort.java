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
public class mergeSort {
    int [] array;
    int [] temp;
    public static void main(String[] args) {
    
        
        int [] arr={8,6,1,5,3,2,0,7,9};
        new mergeSort().prepareSort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
   
        }
        }
    void prepareSort(int []arr){
        this.array=arr;
        this.temp=new int [arr.length];
        doMergeSort(0,arr.length-1);
    }
    //divide 
    void doMergeSort(int low,int high){
        if(low<high){ 
        int mid =low+((high-low)/2);
        doMergeSort(low,mid);
        doMergeSort(mid+1,high);
        mergeSort(low,mid,high);
        }
    }
    void mergeSort(int low,int mid,int high){
        for(int i=low;i<=high;i++)
            temp[i]=array[i];
            int i=low;
            int j=mid+1;
            int k=low;
        while(i<=mid&&j<=high){
            if(temp[i]<=temp[j]){
            array[k]=temp[i];
            i++;
        }else{
            array[k]=temp[j];
            j++;
                } 
            k++;
    }
         while(i<=mid){
         array[k]=temp[i];
         k++;
         i++;
         }
         
    }
}
