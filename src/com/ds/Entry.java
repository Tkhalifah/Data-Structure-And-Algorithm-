/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

/**
 *
 * @author hp
 * @param <T>
 */
public class Entry<T> {
    int key;
    T value;
    Entry next;
    
    public Entry(int key,T value){
        this.key=key;
        this.value=value;
        next=null;
    }
    public Entry(){
        next=null;
    }
    public int getKey(){
        return key;
    }
    public T getValue(){
        return value;
    }
    
}
