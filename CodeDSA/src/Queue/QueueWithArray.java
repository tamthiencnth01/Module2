package Queue;

import java.util.Arrays;

public class QueueWithArray<E> {
    private int size;
    private E[] elements;

    public QueueWithArray() {
        elements = (E[]) new Object[2];
    }
    public void ensureCapa(){
        int newElement = elements.length*2;
        elements = Arrays.copyOf(elements,newElement);
    }
    public void enqueue(E e){
        if(size==elements.length ){
            ensureCapa();
        }
        elements[size] =e;
        size++;
    }
    public E dequeue(){
        if (size<0){
            System.out.println("Queue is empty");
            return null;
        }
        E temp = elements[0];
        for (int i = 0; i <elements.length-1 ; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return temp;
    }
    public int getSize(){
        return this.size;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
