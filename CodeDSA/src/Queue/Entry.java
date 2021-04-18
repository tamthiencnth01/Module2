package Queue;

public class Entry {
    public static void main(String[] args) {
        QueueUseLinkedList<Integer> list = new QueueUseLinkedList();
//        list.enqueue(1);
//        list.enqueue(2);
//        list.enqueue(3);
//        list.enqueue(4);
//        list.enqueue(5);
//        list.dequeue();
//        list.display();
        QueueWithArray<Integer> array = new QueueWithArray<>();
        array.enqueue(1);
        array.enqueue(2);
        array.enqueue(3);
        array.enqueue(4);
        array.enqueue(5);
        array.dequeue();
        array.dequeue();
      //  array.display();
        QueueUseMyLinkedList<String> myLinkedList = new QueueUseMyLinkedList();
        myLinkedList.enqueue("Hân");
        myLinkedList.enqueue("Khánh");
        myLinkedList.enqueue("Quang");
        myLinkedList.enqueue("Thiện");
        myLinkedList.dequeue();
        myLinkedList.display();
    }
}
