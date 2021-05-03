package com.thien.Presetation;

import com.thien.Model.Customer;
import com.thien.Service.Service;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

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
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    try {
                        addCustomer();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    printCustomerByPhoneNumber();
                    break;
                case 3:
                    searchCustomerByPhoneNumber();
                    break;
                case 4:
                    printAllCustomer();
                    break;
                case 5:
                    addOrderPurchase();
                    break;
                case 0:
                    System.out.println("Cám ơn quý khách! Hẹn gặp lại.");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại số để vào chương trình!");
                    break;
            }
        }while (choose!=0);
    }

    private static void addCustomer() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        Pattern emailCheck  = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        String email;
        while (true){
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if (emailCheck.matcher(email).find()){
                break;
            }
        }
        Pattern phone = Pattern.compile("^[0-9]{10}$");
        String phoneNumber;
        while (true){
            System.out.println("Nhập số điện thoại: ");
            phoneNumber = sc.nextLine();
            if(phone.matcher(phoneNumber).find()){
                break;
            }
        }
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        Customer customer = new Customer(name,address,phoneNumber,email,gender);
        service.add(customer);
    }

    private static void printCustomerByPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại khách hàng cần tìm: ");
        String phone = sc.nextLine();
        service.printCustomer(phone);
    }

    private static void searchCustomerByPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại khách hàng: ");
        String phone  = sc.nextLine();
        service.searchPhoneNumber(phone);
    }
    private static void printAllCustomer() {
        service.print();
    }

    private static void addOrderPurchase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại khách hàng: ");
        String phone  = sc.nextLine();
        service.addOrder(phone);
    }

    public static void showMenu(){
        System.out.println("----Chào mừng bạn đến với hệ thống quản lý khách hàng: -----");
        System.out.println("Bấm 1 để nhập khách hàng: ");
        System.out.println("Bấm 2 để in thông tin khách hàng: ");
        System.out.println("Bấm 3 để tìm kiếm khách hàng: ");
        System.out.println("Bấm 4 để in toàn bộ danh sách khách hàng: ");
        System.out.println("Bấm 5 để tăng số đơn hàng cho khách: ");
        System.out.println("Bấm 0 để thoát khỏi chương trình: ");
        System.out.println("--------------------------------------------------------------");
    }
}
