package com.c0221h1;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
//        Student[] students = new Student[100];
//        students[0]= new Student("Quang Tèo", "C01",18,"quangteo@codegym.vn","Nam", "Hue");
//        students[1]= new Student("Long Còi", "C02",18,"longcoi@codegym.vn","Nam","Hue");
//        students[2]= new Student("Thư","C03",16,"thule@codegym.vn","Nu","Hue");
        //Khởi tạo Array List
        ArrayList<Student> studentList = new ArrayList<Student>();
        //System.out.println("Length of List: "+ studentList.size());
        //Thêm một và nhiều phần tử vào trong mảng:
        Student std = new Student("Quang Tèo", "C01",18,"quangteo@codegym.vn","Nam", "Hue");
        studentList.add(std);
        //System.out.println("Length of List: "+ studentList.size());
        std = new Student("Long Còi", "C02",18,"longcoi@codegym.vn","Nam","Hue");
        studentList.add(std);
        //System.out.println("Length of List: "+ studentList.size());
        std = new Student("Thư","C03",16,"thule@codegym.vn","Nu","Hue");
        studentList.add(std);
        //System.out.println("Length of List: "+ studentList.size());]]
        for (Student stdList:
             studentList) {
            System.out.println(stdList);
        }
        System.out.println("************************");
        //Xóa một và nhiều phần tử ra khỏi mảng:
        studentList.remove("Long Còi");
        for (Student stdList:
                studentList) {
            System.out.println(stdList);
        }
    }
}
