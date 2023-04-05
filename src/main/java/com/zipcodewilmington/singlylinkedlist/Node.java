package com.zipcodewilmington.singlylinkedlist;

public class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

   public void setData(T data){
        this.data = data;
   }

   public T getData(){
        return data;

   }

   public void setNext(Node<T> node){
        this.next = node;

   }

   public Node<T> getNext(){
        return next;

   }

}
