package Presetation;

import Model.Student;
import Service.ServiceStudent;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceStudent ss = new ServiceStudent();
        try {
            ss.loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc =new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    try {
                        addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        editStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        deleteStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    printStudent();
                    break;
                case 5:
                    System.out.println("Thoat!!!!");
                    break;
                default:
                    System.out.println("Moi ban nhap lai! ");
                    break;
            }
        }while (choose!=5);
    }

    private static void addStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        Student std = new Student();
        std.setName(name);
        std.setAge(age);
        std.setGender(gender);
        ServiceStudent ss = new ServiceStudent();
        ss.add(std);
    }

    private static void editStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID can tim: ");
        int id = sc.nextInt();
        sc.nextLine();
        ServiceStudent ss = new ServiceStudent();
        Student std = ss.find(id);
        if (std==null){
            System.out.println("Not found");
        }else {
            System.out.println(std.toString());
            std.input();
            std.setName(std.getName());
            std.setAge(std.getAge());
            std.setGender(std.getGender());
            ss.updateFile();
        }
    }

    private static void deleteStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap id muon xoa: ");
        int id = sc.nextInt();
        sc.nextLine();
        ServiceStudent ss = new ServiceStudent();
        ss.remove(id);
    }

    private static void printStudent() {
        ServiceStudent ss = new ServiceStudent();
        ss.print();
    }

    public static void showMenu(){
        System.out.println("---------------Menu--------");
        System.out.println("1.Add student");
        System.out.println("2.Edit student");
        System.out.println("3.Delete student");
        System.out.println("4.Print student");
        System.out.println("5. Exit");
    }
}
