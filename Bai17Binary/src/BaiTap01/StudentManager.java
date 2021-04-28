package BaiTap01;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner sc = new Scanner(System.in);
    private List<Student> list;
    private InOutStudent student;

    public StudentManager() throws IOException {
        student = new InOutStudent();
        list = student.read();
    }
    public void add() throws IOException {
        int id = (list.size()>0) ? (list.size()+1) : 1;
        System.out.println("student id = "+id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        float gpa = inputGPA();
        Student std = new Student(id,name, age, address,gpa);
        list.add(std);
        student.write(list);
    }
    public int inputId(){
        System.out.print("Input student id: ");
        while (true){
            try {
                int id =Integer.parseInt(sc.nextLine());
                return id;
            }catch (NumberFormatException e){
                System.out.print("Invalid! Please input ID again!");
            }
        }
    }
    public String inputName(){
        System.out.print("Input student name: ");
        return sc.nextLine();
    }
    public byte inputAge(){
        System.out.print("Input student age: ");
        while (true){
            try {
                byte age = Byte.parseByte(sc.nextLine());
                if (age<0&&age>100){
                    throw new NumberFormatException();
                }
                return age;
            }catch (NumberFormatException e){
                System.out.print("Invalid! Please input Age again!");
            }
        }
    }
    public String inputAddress(){
        System.out.print("Input student address: ");
        return sc.nextLine();
    }
    public float inputGPA(){
        System.out.print("Input student GPA: ");
        while (true){
            try {
                float gpa = Float.parseFloat(sc.nextLine());
                if (gpa<0.0&&gpa>10.0){
                    throw new NumberFormatException();
                }
                return gpa;
            }catch (NumberFormatException e){
                System.out.print("Invalid! Please input GPA again!");
            }
        }
    }
}
