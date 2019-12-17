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
public class Node<T> {
    T value;
    Node next;
    public Node(T value,Node next){
        this.value=value;
        this.next=next;
    }
    
}
