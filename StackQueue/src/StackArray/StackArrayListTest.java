package StackArray;

public class StackArrayListTest {
    public static void main(String[] args) {
        StackArrayList<Integer> list = new StackArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.display();
        System.out.println("Value remove: "+list.remove());
        System.out.println("Get size: "+list.getSize());
    }
}
