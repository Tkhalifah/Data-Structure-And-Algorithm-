/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

/**
 *
 * @author hp
 * @param <T>
 */
public class StackArray<T> {
    int size;
    Object [] ArrayStack;
    int top;
    public StackArray(int size){
        this.size=size;
        ArrayStack =new Object[this.size];
        top=-1;
    }
    public void PUSH(Object element){
        if(IsFull())
        {System.out.println("full..........");
            return;}
        top+=1;
        ArrayStack[top]=element;
    }
    public boolean IsFull(){  
            return (top==size-1);
    }
    public T Pop(){
        if(IsEmpty())
            {System.out.println("empty..........");
            return null;}
       // T item =(T) ArrayStack[top];
        return (T) ArrayStack[top--];// item;
    }
    public boolean IsEmpty(){
        return (top==-1);
    }
}
