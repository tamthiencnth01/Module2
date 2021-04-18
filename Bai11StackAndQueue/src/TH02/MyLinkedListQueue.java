package TH02;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail=null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        //case last node
        if (this.tail==null){
            this.head=this.tail=temp;
            return;
        }
        // Hoi
        this.tail.next=temp;
        this.tail=temp;
    }
    public Node dequeue(){
        if (this.head==null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head==null)
            this.tail=null;
        return temp;
    }

    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
//        queue.enqueue(50);
//        queue.enqueue(40);
//        queue.enqueue(50);
        System.out.println("Dequeued item is:" + queue.dequeue().key );
    }
}
