package com.BT01;

public class MyListTest {
    public static void main(String[] args) {
        com.BT01.MyList<String> list = new com.BT01.MyList<>();
        list.add("thiện");
        list.add("không");
        list.add("đẹp");
        list.add("trai");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add(1,"rất");
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("thiện"));
        System.out.println(clone.contains("không"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
