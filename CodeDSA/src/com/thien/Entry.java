package com.thien;

public class Entry {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.addFirst("Nguyen");
        list.addFirst("Thien");
        list.addFirst("Le");
        list.addLast("thao");
        list.add(1,"Nang");
        list.display();
        System.out.println("*************");
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        list.remove(1);
        list.remove(0);
        list.display();
        System.out.println(list.isEmpty());
    }
}
