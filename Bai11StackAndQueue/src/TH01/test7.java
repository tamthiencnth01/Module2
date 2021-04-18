package TH01;

import java.util.Arrays;

public class test7<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public test7() {
        elements= new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int length = elements.length*2;
        elements = Arrays.copyOf(elements,length);
    }

    public void add(E e){
        if (size==elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
}
