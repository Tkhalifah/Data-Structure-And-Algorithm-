/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

import java.util.Stack;

/**
 *
 * @author hp
 */
public class StackArrayDemo {
    public static void main(String[] args) {
        //also we can use the default stack in java called stack
        Stack<String> stc=new Stack<>();
        // this equal dynamic stack 
        // and we can all methods like push() and pop() NICE :)
        
        
        StackArray<Integer> SA= new StackArray<>(5);
        SA.Pop();
        SA.PUSH(1);
        SA.PUSH(12);
        SA.PUSH(155);
        System.out.println("top :"+SA.top);
        System.out.println(SA.Pop());
        System.out.println("top :"+SA.top);
        SA.PUSH(111);
        SA.PUSH(188);
        SA.PUSH(1000);
        System.out.println(SA.Pop());
        System.out.println(SA.Pop());
        System.out.println(SA.Pop());
        System.out.println(SA.Pop());
        System.out.println(SA.Pop());
        System.out.println(SA.Pop());
        System.out.println(SA.Pop());
        
        // Dynamic stack
        StackArrayDynamic<Integer> Stack= new StackArrayDynamic<>(5);
        Stack.Pop();
        Stack.PUSH(1);
        Stack.PUSH(12);
        Stack.PUSH(155);
        Stack.PUSH(111);
        Stack.PUSH(188);
        Stack.PUSH(1000);
        System.out.println("top :"+Stack.top);
        System.out.println(Stack.Pop());
        System.out.println("size :"+Stack.ArrayStack.length);
    }
    // WE CAN USE linkedlist stack here
    
}
