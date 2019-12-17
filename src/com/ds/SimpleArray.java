/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

/**
 *
 * @author hp
 */
public class SimpleArray {
      public static void main(String[] args) {
        int []numbers= new int[5];
        numbers[0]=11;
        numbers[1]=2;
        numbers[2]=7;
        numbers[3]=30;
        numbers[4]=4;
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
          System.out.println("new array....");
            Students[] stu=new Students[3];
            stu[0]=new Students("ahmed", 1);
            stu[1]=new Students("mohamed", 2);
            stu[2]=new Students("taha", 3);
          for (Students stu1 : stu) {
              System.out.println(stu1.name+":"+stu1.id);
       
          }
          
          //two dim
          int [][]two=new int[2][3];
          two[0][0]=00;
          two[0][1]=01;
          two[0][2]=02;
          two[1][0]=03;
          two[1][1]=04;
          two[1][2]=05;
          
          for(int i=0;i<two.length;i++){
              for(int j=0;j<two[i].length;j++)
                  System.out.print(two[i][j]+"\t");
          System.out.println("\n");
          }
    }
    
}
