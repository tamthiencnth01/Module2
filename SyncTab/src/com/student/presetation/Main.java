package com.student.presetation;

import com.student.dal.StudentIO;
import com.student.model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Map<Integer, Student> studentList = new HashMap<>();


    public static void main(String[] args) throws IOException {
        int choose;
        do {showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    printStudent();
                    break;
                case 4:
                    printStudent();
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Ban da nhap sai ! Moi ban nhap lai");
                    break;
            }

        }while (choose!=5);
    }

    public static void showMenu(){
        System.out.println("---------Menu-----------");
        System.out.println("1. Them Sinh Vien");
        System.out.println("2. Sua Sinh Vien");
        System.out.println("3. Xoa Sinh Vien");
        System.out.println("4. Hien Thi Sinh Vien");
        System.out.println("5. Thoat");
    }
    private static void deleteStudent() {
    }

    private static void editStudent() {
    }

    private static void addStudent() throws IOException {
        System.out.println("Moi ban nhap so luong sinh vien can nhap: ");
        int n = Integer.parseInt(sc.nextLine());
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Ban Nhap Thong Tin SInh Vien");
                Student std = new Student();
                std.input();
                studentList.put(std.getRollNo(),std);
                StudentIO.write(studentList);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static void printStudent() throws IOException {
//        for (Map.Entry<Integer, Student> std:
//             studentList.entrySet()) {
//            System.out.println(std.getKey()+"    "+std.getValue());
//        }
     StudentIO.read();
    }
}
