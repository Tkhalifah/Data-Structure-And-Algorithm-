/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

/**
 *
 * @author hp
 */
public class Node {
    int dist;
    Node next;
  public  Node(int dist,Node next){
      this.dist=dist;
      this.next=next;
  }
} 
