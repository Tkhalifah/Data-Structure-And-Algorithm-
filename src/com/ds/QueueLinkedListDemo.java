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
public class QueueLinkedListDemo {
    public static void main(String[] args) {
        NodeDouble node=new NodeDouble<>(12, null, null);
        QueueLinkedList ql;
        ql = new QueueLinkedList(node);
        ql.ADD(new NodeDouble(11, null, null));
        ql.ADD(new NodeDouble(10, null, null));
        ql.ADD(new NodeDouble(11, null, null));
        System.out.println(ql.DELETE());
        System.out.println(ql.DELETE());
        System.out.println(ql.DELETE());
        
    }
}
