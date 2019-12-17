/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

import java.util.Arrays;

/**
 *
 * @author hp
 * @param <T>
 */
public class StackArrayDynamic<T> {

    int size;
    Object[] ArrayStack;
    int top;

    public StackArrayDynamic(int size) {
        this.size = size;
        ArrayStack = new Object[this.size];
        top = -1;
    }

    public void PUSH(Object element) {
//        if (IsFull()) {
//            System.out.println("full..........");
//            return;
//        }
      checkIn(top+2);
        top += 1;
        ArrayStack[top] = element;
    }

    public void checkIn(int minCapacity) {
        int oldCapacity = ArrayStack.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);
        }
    }

    public boolean IsFull() {
        return (top == size - 1);
    }

    public T Pop() {
        if (IsEmpty()) {
            System.out.println("empty..........");
            return null;
        }
        // T item =(T) ArrayStack[top];
        return (T) ArrayStack[top--];// item;
    }

    public boolean IsEmpty() {
        return (top == -1);
    }
}
