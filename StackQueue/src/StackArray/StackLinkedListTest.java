package StackArray;

public class StackLinkedListTest {
    public static void main(String[] args) {
        StackLinkedList<String> std = new StackLinkedList<>();
        std.add("Han");
        std.add("Duong");
        std.add("Phong");
        std.add("Huy");
        std.add("Chuong");
        std.display();
        System.out.println("*************");
        std.remove();
        std.display();
        System.out.println("************");
        System.out.println(std.isEmpty());
        std.add("Quang");
        std.display();
        System.out.println(std.getSize());
    }
}
