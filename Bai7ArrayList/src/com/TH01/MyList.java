package com.TH01;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        //Khởi tạo một danh sách
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Phương thức tăng gấp đôi kích thước mảng chứa phần tử
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
        //Phương thức copyOf dùng để sao chép mảng được chỉ định vào mảng mới cùng một kiểu
    }
    //Phương thức add
    public void add(E e){
        if (size==elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index is: "+i+", Size: "+i);
            //IndexOutOfBoundsException: lấy chỉ mục ra khỏi ràng buộc ngoại lệ
        }
        return (E) elements[i];
    }
}
