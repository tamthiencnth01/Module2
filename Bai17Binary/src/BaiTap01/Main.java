package BaiTap01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String choose = null;
        boolean exit =false;
        StudentManager studentManager = new StudentManager();
        int studentId;
        //show Menu
        showMenu();
        while (true){
            choose = sc.nextLine();
            switch (choose){
                case "1":
                    studentManager.add();
                    break;
                case "0":
                    System.out.println("Exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! Please choose action: ");
                    break;
            }
            if (exit){
                break;
            }
            showMenu();
        }

    }
    public static void showMenu(){
        System.out.println("----------menu---------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show student.");
        System.out.println("-----------------------");
        System.out.print("Please choose: ");
    }
}
