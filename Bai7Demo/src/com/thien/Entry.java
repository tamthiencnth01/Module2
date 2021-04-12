package com.thien;

public class Entry {
    public static void main(String[] args) {
        Point begin = new Point(1,1);
        Point end = new Point(2,2);
        Line line1 = new Line(begin,end);
        System.out.println("Khoang cach giua hai diem truoc: "+line1.getLength());
        System.out.println("***********************");
        Line line2 = new Line(2,3,5,4);
        System.out.println("Khoang cach giua hai diem sau: "+line2.getLength());
    }
}
