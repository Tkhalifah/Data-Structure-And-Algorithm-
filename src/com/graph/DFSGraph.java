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
public class DFSGraph {
    int size;
    adjList[] array;
   public  DFSGraph(int size){
       this.size=size;
       array=new adjList[this.size];
       for(int i=0;i<size;i++){
           array[i]=new adjList();
           array[i].head=null;
       }
   }
   public void AddNode(int src,int dist){
       
    Node n=new Node(dist,null);
    n.next=array[src].head;
    array[src].head=n;
   }
}
