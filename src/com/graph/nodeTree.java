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
public class nodeTree {
    int value;
    nodeTree left;
    nodeTree right;
    public nodeTree(int value,nodeTree left,nodeTree right){
        this.value=value;
        this.left=left;
        this.right=right;
    }
    
}
