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
public class HashTableArrayDemo {
    public static void main(String[] args) {
        HashTableArray hash =new HashTableArray(10);
        hash.Put(10, "taha");
        hash.Put(11, "aaaaa");
        hash.Put(15, "cccc");
        hash.Put(10, "sssss");
        hash.Put(5, "mmmmmm");
        System.out.println(hash.Get(5));
    }
}
