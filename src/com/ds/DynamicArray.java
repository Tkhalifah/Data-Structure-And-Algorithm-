/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class DynamicArray<T> {

    Object[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = new Object[1];
    }
    public T get(int index){
        return(T) data[index];
    }
    public int getSize(){
        return data.length;
    }
    public void put(int num){
        checkIn(size+1);
        data[size++]=num;
        
    }
    public void checkIn(int minCapacity){
        int oldCapacity=data.length;
        if(minCapacity > oldCapacity){
           int newCapacity=oldCapacity*2;
        if(newCapacity<minCapacity)
            newCapacity=minCapacity;
        data=Arrays.copyOf(data, newCapacity);
        }
    }
}
