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
public class NodeDouble<T> {
    T value;
    NodeDouble next;
    NodeDouble prevous;
    public NodeDouble(T value,NodeDouble next,NodeDouble prevous){
        this.value=value;
        this.next=next;
        this.prevous=prevous;
    }
    
}

