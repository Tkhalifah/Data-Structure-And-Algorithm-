/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author hp
 */
public class interPolationSearch {
    public static void main(String[] args) {
        int size =1000000;
        int[] numbers=new int[size];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=i+1;
        }
        int searchNumber =998999;
        int low=0;
        int high=numbers.length -1;
        int mid =0;
        int count =0;
        Boolean isFound=false;
        while(!isFound)
           
                {
                    count++;
                    if(low>high)
                    {
                        System.out.println("number is not found");
                        break;
                    }
                    mid=low+((high-low)/(numbers[high]-numbers[low]))
                            *(searchNumber-numbers[low]);  
                    if(numbers[mid]==searchNumber)
                    {
                        
                        System.out.println("number is found after "+count);
                        break;
                    }
                    if(numbers[mid]<searchNumber)
                    {
                        low=mid+1;
                        
                    }
                    if(numbers[mid]>searchNumber)
                    {
                        high=mid-1;
                        
                    }
                }
    }
}
