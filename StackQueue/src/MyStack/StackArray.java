package MyStack;

import java.util.Arrays;

public class StackArray<E> {

    int size;
    E[] element = (E[]) new Object[2];

    boolean isEmpty(){
        return size <0;
    }
    void ensureCapa(){
        int e = element.length*2;
        element = Arrays.copyOf(element,e);
    }
    void push(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    E pop(){
        if(size==0){
            return null;
        }
        return element[--size];
    }
    E peek(){
        if (size==0){
            return null;
        }
        return element[size-1];
    }
    int getSize(){
        return this.size;
    }
    void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(element[i]);
        }
    }

    public static void main(String[] args) {
        StackArray<String> array = new StackArray<>();
        array.push("Quang");
        array.push("Map");
        array.push("Quang");
        array.push("Teo");
        array.push("Long");
        array.display();
        System.out.println();
        array.pop();
        array.display();
    }
}
