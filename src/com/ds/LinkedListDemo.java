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
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(new Node<>(10, null));

        list.ADD(new Node<>(11, null));

        list.ADD(new Node<>(5, null));

        list.ADD(new Node<>(100, null));
        list.Display();
        list.DELETE();
        list.Display();
    }
}
