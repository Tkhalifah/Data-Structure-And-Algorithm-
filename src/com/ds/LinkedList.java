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
public class LinkedList {
    Node head;
    public LinkedList(Node head){
      this.head=head;
    }
    public void ADD(Node newNode){
        newNode.next=head;
        head=newNode; 
    
    }
    public void DELETE(){
        head=head.next;
    }
    public void Display(){
        Node n=head;
        while (n!=null) {
            System.out.println(n.value);
            n=n.next;  
        }
    }
}
