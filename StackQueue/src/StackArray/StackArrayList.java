package StackArray;

import java.util.ArrayList;

public class StackArrayList<E> {
    private int size;
    private ArrayList<E> elements;

    public StackArrayList() {
        elements = new ArrayList<>();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    public void add(E e){
        elements.add(size++,e);
    }
    public E remove(){
        return elements.remove(--size);
    }
    public int getSize(){
        return this.size;
    }
    public void display(){
        for (int i = elements.size()-1;i>=0; i--) {
            System.out.println(elements.get(i));
        }

    }
}
