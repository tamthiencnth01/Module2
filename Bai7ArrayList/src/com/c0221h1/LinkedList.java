package com.c0221h1;

import org.w3c.dom.Node;

import java.util.List;

public class LinkedList {
    //Nút đầu của Danh sách
    Node head;
    //Constructor
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;//Kết nối nút đầu tiên với nút thứ 2
        second.next = third;//Kết nối nút thứ 2 với nút thứ 3
        llist.printList();
    }
//    public void push(int new_data)
//    {
//    /* 1 & 2: Allocate the Node &
//               Put in the data*/
//        Node new_node = new Node(new_data);
//
//        /* 3. Make next of new Node as head */
//        new_node.next = head;
//
//        /* 4. Move the head to point to new Node */
//        head = new_node;
//    }
}
