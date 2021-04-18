package Stack;

import java.util.Arrays;

public class StackWithArray<E> {
    private int size;
    private E[] elements;

    public StackWithArray() {
        elements = (E[]) new Object[2];
    }
    public void ensureCapa(){
        int newElements = elements.length*2;
        elements = Arrays.copyOf(elements,newElements);
    }
    public void push(E e){
        if (size==elements.length){
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }
    public E pop(){
        if (size<0){
            System.out.println("Stack is empty");
            return null;
        }
        E temp = elements[size-1];
        elements[size-1]=null;
        size--;
        return temp;
    }
    public E peek(){
        if (size<0){
            System.out.println(("Stack is empty"));
            return null;
        }
        return elements[size-1];
    }
    public int indexOf(E e){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]==e) return i;
        }
        return -1;
    }
    public E contains(int index){
        for (int i = 0; i < elements.length; i++) {
            if (i==index) return elements[i];
        }
        return null;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
