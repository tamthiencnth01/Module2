package Stack;

public class Entry {
    public static void main(String[] args) {
        StackUseLinkedList<String> list = new StackUseLinkedList<>();
//        list.push("Welcome");
//        list.push("to");
//        list.push("my");
//        list.push("class");
//        list.pop();
//        list.display();
//        System.out.println("Giá trị cần lấy ra là: "+list.peek());
        StackUseMyLinkedList<Integer> mylist = new StackUseMyLinkedList<>();
        mylist.push(1);
        mylist.push(2);
        mylist.push(3);
        mylist.push(4);
        mylist.push(5);
        mylist.pop();
        System.out.println("Peek is: "+mylist.peek());
        mylist.peek();
        mylist.display();
//        StackWithArray<Integer> array = new StackWithArray<>();
//        array.push(1);
//        array.push(2);
//        array.push(3);
//        array.push(4);
//        array.push(5);
//        array.pop();
//        System.out.println("Value Peek is: "+array.peek());
//        System.out.println("Check value at index : "+array.indexOf(5));
//        System.out.println("Check index is value: "+array.contains(2));
//        array.display();
    }
}
