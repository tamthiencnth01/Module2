package Queue;

import java.util.LinkedList;

public class QueueUseLinkedList<E> {
    private int size;
    private LinkedList<E> elements;

    public QueueUseLinkedList() {
        elements = new LinkedList<>();
    }
    public void enqueue(E e){
        elements.addLast(e);
        size++;
    }
    public E dequeue(){
        if (size<0){
            return null;
        }
        size--;
        return elements.removeFirst();
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements.get(i));
        }
    }
}
