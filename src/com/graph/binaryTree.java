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
public class binaryTree {

    nodeTree root;

    public binaryTree(nodeTree root) {
        this.root = root;
    }

    public void addNode(nodeTree newNode, nodeTree rootExplore) {
        if (rootExplore == null) {
            return;
        }
        if (newNode.value > rootExplore.value) {
            if (rootExplore.right == null) {
                rootExplore.right = newNode;
            } else {
                addNode(newNode, rootExplore.right);
            }
        }
        if (newNode.value < rootExplore.value) {
            if (rootExplore.left == null) {
                rootExplore.left = newNode;
            } else {
                addNode(newNode, rootExplore.left);
            }
        }
    }
        public void Search(int value, nodeTree rootExplore) {
        if (rootExplore == null) {
            System.out.println("num isn't found ");
            return;
        }
        if(rootExplore.value ==value){
            System.out.println("we found the num ");
        }
        if (value > rootExplore.value) {
           
                Search(value, rootExplore.right);     
        }
        if (value < rootExplore.value) {
            
                Search(value, rootExplore.left);   
        }
      
    }
}
