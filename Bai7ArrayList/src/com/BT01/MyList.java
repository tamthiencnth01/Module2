package com.BT01;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPICITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPICITY];
    }
    public MyList(int capicity) {
        elements = new Object[capicity];
    }
    public void add(int index, E element){

    }
}
