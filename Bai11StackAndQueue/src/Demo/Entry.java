package Demo;

import TH01.MyGenericStack;

public class Entry {
    public static void main(String[] args) {
        MyClass entry = new MyClass();
        entry.push(2);
        entry.push(4);
        entry.push(3);

        entry.display();
        System.out.println("#########");
        System.out.println("Giao tri boc: "+entry.pop());
        entry.display();
        System.out.println("Giao tri peek la: "+entry.peek());
    }
}
