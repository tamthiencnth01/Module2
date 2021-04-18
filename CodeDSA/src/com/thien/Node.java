package com.thien;

public class Node<E>{
    public Node<E> next;
    public E element;
    public Node(E element){
        this.element = element;
    }
}