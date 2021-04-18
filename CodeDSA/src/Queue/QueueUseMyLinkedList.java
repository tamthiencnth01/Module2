package Queue;

import com.thien.MyLinkedList;

public class QueueUseMyLinkedList<E> {
    public MyLinkedList<E> queue;

    public QueueUseMyLinkedList() {
        queue = new MyLinkedList<>();
    }
    public void enqueue(E e){
        queue.addLast(e);
    }
    public E dequeue(){
        if (queue.isEmpty()) {return null;}
        return queue.removeFirst();
    }
    public void display(){
        queue.display();
    }
}
