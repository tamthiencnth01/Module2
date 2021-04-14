package com.BT01;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    private static final int DEFAULT_CAPICITY = 10;
    private E[] elements;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyList() {
        elements =(E[]) new Object[DEFAULT_CAPICITY];
    }
    public MyList(int size) {
        elements =(E[]) new Object[size];
    }
    private void ensureCapa(){
        if(size>elements.length){
            int newSize = elements.length*2;
            elements = Arrays.copyOf(elements,newSize);
        }
    }
    public void add(E element){
        size+=1;
        ensureCapa();
        elements[size-1]=element;
    }
    public boolean add(int index, E element){
        if (index>=0 && index <= size){
            size+=1;
            ensureCapa();
            for (int i=size-2;i>=index;i--){
                elements[i+1] = elements[i];
            }
            elements[index]=element;
            return true;
        }
        return false;
    }
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public MyList<E> clone(){
        MyList<E> a = new MyList<>();
        for (int i=0;i<size;i++){
            a.elements[i]=this.elements[i];
        }
        return a;
    }
    public boolean contains(E o){
        for (int i = 0; i <size ; i++) {
            if (elements[i]==o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size ; i++) {
            if (elements[i]==o){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        for (int i = 0; i <size ; i++) {
            elements[i]=null;

        }
    }
    public E[] getData() {
        return this.elements;
    }
    public int size() {
        return size;
    }
}
