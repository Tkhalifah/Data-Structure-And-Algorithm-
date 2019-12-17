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
public class QueueLinkedList<T> {
    NodeDouble<T> Rear;
    NodeDouble<T> Front;
    public QueueLinkedList(NodeDouble<T> newNode){
      Front=newNode;
      Rear=newNode;
    }
    public void ADD(NodeDouble<T> newNode){
        newNode.next=null;
        newNode.prevous=Rear;
        Rear.next=newNode; 
        Rear=newNode;
    
    }
    public T DELETE(){
        T value =Front.value;
        Front=Front.next;
        Front.prevous=null;
        return value;  
    }
   
}

