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
public class HashTableArray<T> {
    Entry [] arrayHash;
    int size;
    public HashTableArray(int size){
        this.size=size;
        arrayHash=new Entry[this.size];
        for(int i=0;i<arrayHash.length;i++){
            arrayHash[i]=new Entry<>();
        }
    }
    int getHash(int key){
        return key%size;
    }
    public void Put(int key,T value){
        int index =getHash(key);
        Entry arrayValue = arrayHash[index];
        Entry newItem = new Entry<>(key,value);
        newItem.next=arrayValue.next;
        arrayValue.next=newItem;
    }
    public T Get(int key){
        T val=null;
        int index=getHash(key);
        Entry arrValue =arrayHash[index];
        while(arrValue!=null){
            if(arrValue.getKey()==key){
                val=(T)arrValue.getValue();
                break;
            }
            arrValue=arrValue.next;   
        }
        return val;
    }
}
