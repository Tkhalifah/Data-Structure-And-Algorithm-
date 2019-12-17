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
public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray<Integer> DA = new DynamicArray<>();
        DA.put(4);
        System.out.println("data size :" + DA.getSize());
        DA.put(4);
        System.out.println("data size :" + DA.getSize());
        DA.put(4);
        System.out.println("data size :" + DA.getSize());
        DA.put(4);
        System.out.println("data size :" + DA.getSize());
        DA.put(4);
        System.out.println("data size :" + DA.getSize());
    }
}
