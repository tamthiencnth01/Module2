package com.codegym;
public class TestStaticMethod {
    public static void main(String[] args) {
        com.codegym.Student.change();
        Student s1 = new com.codegym.Student(111, "Hoang");
        Student s2 = new com.codegym.Student(222, "Duoc");
        Student s3 = new com.codegym.Student(333, "Su");
        s1.display();
        s2.display();
        s3.display();

    }
}
