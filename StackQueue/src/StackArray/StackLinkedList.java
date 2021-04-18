package StackArray;

import java.util.LinkedList;

public class StackLinkedList<E> {
    private int size=0;
    private LinkedList<E> elements;


    public StackLinkedList() {
        elements = new LinkedList<E>();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    public void add(E e){
        elements.addLast(e);
        size++;
    }
    public E remove(){
        size--;
        return elements.removeLast();

    }
    public int getSize(){
        return this.size;
    }
    public void display(){
        for (int  i = elements.size()-1;i >= 0; i--) {
            System.out.println(elements.get(i));
        }
    }
}
