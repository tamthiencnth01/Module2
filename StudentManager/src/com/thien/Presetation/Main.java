package com.thien.Presetation;

import com.thien.Dal.Database;
import com.thien.Model.Student;
import com.thien.Service.Service;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static Service service = new Service();
    public static void main(String[] args) {
        try {
            service.loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.print("Xin mời bạn nhập số:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    printStudents();
                    break;
                case 2:
                    try {
                        addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        editStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        deleteStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        inputPointStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        editPointStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    classifyStudents();
                    break;
                case 8:
                    System.out.println("Cám ơn quý khách! Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại: ");
                    break;
            }
        }while (choose!=8);
    }

    private static void printStudents() {
        service.print();
    }

    private static void addStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên Học Viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập Tuổi Học Viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Giới Tính: ");
        String gender = sc.nextLine();
        Student student = new Student(name,age,gender);
        service.add(student);
    }

    private static void editStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ID Sinh Viên cần thay đổi thông tin: ");
        int id = Integer.parseInt(sc.nextLine());
        int size = Database.list.size();
        for (int i = 0; i < size; i++) {
            if (Database.list.get(i).getRoolNo()==id){
                System.out.println(Database.list.get(i).toString());
                System.out.println("Nhập Tên Học Viên: ");
                Database.list.get(i).setName(sc.nextLine());
                System.out.println("Nhập Tuổi Học Viên: ");
                Database.list.get(i).setAge(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập Giới Tính: ");
                Database.list.get(i).setGender(sc.nextLine());
                service.updateData();
                break;
            }
            else System.out.println("Not found");
        }
    }


    private static void deleteStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ID Sinh Viên cần xóa thông tin: ");
        int id = Integer.parseInt(sc.nextLine());
        int size = Database.list.size();
        for (int i = 0; i < size; i++) {
            if (Database.list.get(i).getRoolNo()==id){
                System.out.println(Database.list.get(i).toString());
                service.removeStudent(Database.list.get(i).getRoolNo());
                break;
            }
            else System.out.println("Not found");
        }
    }

    private static void inputPointStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ID Sinh Viên Đã Thi xong: ");
        int id = Integer.parseInt(sc.nextLine());
        int size = Database.list.size();
        for (int i = 0; i < size; i++) {
            if (Database.list.get(i).getRoolNo()==id){
                System.out.println(Database.list.get(i).toString());
                System.out.println("Nhập điểm học viên lần 1");
                Database.list.get(i).setFirstPoint(sc.nextInt());
                System.out.println("Nhập điểm học viên lần 2");
                Database.list.get(i).setSecondPoint(sc.nextInt());
                System.out.println("Nhập điểm học viên lần 3");
                Database.list.get(i).setThirdPoint(sc.nextInt());
                System.out.println("Nhập điểm học viên lần 4");
                Database.list.get(i).setFourthPoint(sc.nextInt());
                int avg = ((Database.list.get(i).getFirstPoint()+Database.list.get(i).getSecondPoint())+(Database.list.get(i).getThirdPoint()*2)+(Database.list.get(i).getFourthPoint()*3))/7;
                Database.list.get(i).setAveragePoint(avg);
                service.updateData();
                break;
            }
        }
    }

    private static void editPointStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ID Sinh Viên cần sửa điểm: ");
        int id = Integer.parseInt(sc.nextLine());
        int size = Database.list.size();
        for (int i = 0; i < size; i++) {
            if (Database.list.get(i).getRoolNo()==id){
                System.out.println(Database.list.get(i).toString());
                System.out.println("Nhập điểm học viên lần 1");
                Database.list.get(i).setFirstPoint(sc.nextInt());
                System.out.println("Nhập điểm học viên lần 2");
                Database.list.get(i).setSecondPoint(sc.nextInt());
                System.out.println("Nhập điểm học viên lần 3");
                Database.list.get(i).setThirdPoint(sc.nextInt());
                System.out.println("Nhập điểm học viên lần 4");
                Database.list.get(i).setFourthPoint(sc.nextInt());
                int avg = ((Database.list.get(i).getFirstPoint()+Database.list.get(i).getSecondPoint())+(Database.list.get(i).getThirdPoint()*2)+(Database.list.get(i).getFourthPoint()*3))/7;
                Database.list.get(i).setAveragePoint(avg);
                service.updateData();
                break;
            }
            else System.out.println("Not found");
        }
    }

    private static void classifyStudents() {
        Collections.sort(Database.list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAveragePoint()>=o2.getAveragePoint()?-1:1;
            }
        });
    }

    public static void showMenu(){
        System.out.println("---------MENU---------------------------");
        System.out.println("Bấm 1. Xem danh sách học viên");
        System.out.println("Bấm 2. Thêm học viên");
        System.out.println("Bấm 3. Sửa thông tin học viên");
        System.out.println("Bấm 4. Xóa học viên");
        System.out.println("Bấm 5. Nhập 4 cột điểm của học viên: ");
        System.out.println("Bấm 6. Sửa điểm học viên: ");
        System.out.println("Bấm 7. Xếp loại học viên: ");
        System.out.println("Bấm 8. Thoát khỏi chương trình: ");
        System.out.println("----------------------------------------");
    }
}
