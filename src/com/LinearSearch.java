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
public class LinearSearch {
    public static void main(String[] args) {
        int size =1000000;
        int[] numbers=new int[size];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=i+1;
        }
        int searchNumber=998999;
       int  count=0;
        for(int i=0;i<numbers.length;i++)
        {
            count++;
            if(numbers[i]==searchNumber)
            {
                System.out.println("number is found after "+count);
                break;
            }
           
        }
    }
    
}
