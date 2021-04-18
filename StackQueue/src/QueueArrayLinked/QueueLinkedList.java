package QueueArrayLinked;

import java.util.LinkedList;

public class QueueLinkedList<E> {
    private int size;
    private LinkedList<E> elements;

    public QueueLinkedList() {
        elements = new LinkedList<>();
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
        return elements.removeFirst();
    }
    public int getSize(){
        return this.size;
    }
    public void display(){
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }

    }
}
