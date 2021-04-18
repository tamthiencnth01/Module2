package Demo;

public class StackNode {
    int data;
    StackNode head;
    StackNode next;

    public StackNode() {
    }

    public StackNode(int data) {
        this.data = data;
    }
    public boolean isEmpty(){
        if (head==null){
            return true;
        }
        return false;
    }
    public void push(int data){
        StackNode newNode= new StackNode(data);
        if (head==null){
            head = newNode;
        }
        else {
            StackNode temp = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println(data+ " được đẩy vào stack");
    }
    public int pop(){
        int popped = Integer.MIN_VALUE;
        if (head==null){
            System.out.println("Stack is Empty");
        }
        else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }
    public int peek(){
        if (head==null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else return head.data;
    }
}
