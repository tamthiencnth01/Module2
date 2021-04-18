package com.thien;

public class MyLinkedList<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    private  int numNodes;

    public MyLinkedList(E element) {
        head = new Node(element);
    }
    public MyLinkedList() {

    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
        if (tail==null){
            tail=head;
        }
    }
    public void addLast(E e){
        Node temp = new Node<>(e);
        if (tail == null){
            head=tail=temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        numNodes++;
    }
    public E remove(int index){
        if (index<0||index>=numNodes) return null;
        else if (index==0) return removeFirst();
        else if (index==numNodes-1) return removeLast();
        else {
            Node holder = head;
            for (int i = 0; i < index; i++) {
                holder = holder.next;
            }
            Node current = holder.next;
            holder.next = current.next;
            numNodes--;
            return (E) current.element;
        }
    }
    public E removeFirst(){
        if (numNodes==0) return null;
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            if (head==null) tail=null;
            return (E) temp.element;
        }
    }
    public E removeLast(){
        if (numNodes==0) return null;
        else if (numNodes==1){
            Node temp = head;
            head =tail=null;
            numNodes=0;
            return (E) temp.element;
        }
        else {
            Node current = head;
            for (int i = 0; i < numNodes -2; i++) {
                current = current.next;
            }
            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.element;
        }
    }
    public boolean isEmpty(){
        return (numNodes==0) ;

    }
    public int size(){
        return numNodes;
    }
    public E get(int j){
        Node temp = head;
        for(int i=0;i< j;i++){
            temp= temp.next;
        }
        return (E) temp.element;
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
}