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
public class binaryTreeDemo {
    public static void main(String[] args) {
        binaryTree bTree=new binaryTree(new nodeTree(5,null,null));
//        for(int i=0;i<10;i++){
//            bTree.addNode(new nodeTree(i,null,null), bTree.root);
//        }
        bTree.addNode(new nodeTree(6,null,null), bTree.root);
        bTree.addNode(new nodeTree(2,null,null), bTree.root);
        bTree.addNode(new nodeTree(4,null,null), bTree.root);
        bTree.addNode(new nodeTree(8,null,null), bTree.root);
        bTree.Search(8,bTree.root );
        System.out.println(bTree.root.value);
        System.out.println(bTree.root.right.value);
        System.out.println(bTree.root.left.value);
//        System.out.println(bTree.root.left.left.value);
//        System.out.println(bTree.root.left.right.value);
        System.out.println(bTree.root.right.right.value);
      //   System.out.println(bTree.root.right.right.right.value);
    }
}
