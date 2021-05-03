package com.thien.Service;

import com.thien.Dal.Database;
import com.thien.Model.Customer;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public static Database dt = new Database();
    public void add(Customer customer) throws IOException {
        for (int i = 0; i < Database.list.size(); i++) {
            if (Database.list.get(i).getPhoneNumber().equals(customer.getPhoneNumber())&& Database.list.get(i).getEmail().equals(customer.getEmail())){
                System.out.println("Khách Hàng Đã Tồn Tại! Hệ Thống Đang Cập Nhật Lại");
                return;
            }
        }
        System.out.println("Bạn vừa thêm mới khách hàng: "+customer.getName()+" thành công");
        System.out.println("Chọn menu để thực hiện tiếp");
        System.out.println("=================================================");
        dt.add(customer);
        dt.writeFile();
    }
    public void print(){
        if (Database.list.size()==0){
            System.out.println("Không có khách hàng nào trong hệ thống");
        }
        if (Database.list.size()>3){
            for (int i = 0; i < 3; i++) {
                System.out.println(Database.list.get(i));
            }
        }
        System.out.println("...");
        System.out.println("Tổng cộng có "+Database.list.size() +" Khách Hàng trong hệ thống");
    }
    public void searchPhoneNumber(String phoneNumber){
        System.out.println("Hệ thống đang tìm kiếm: ");
        for (Customer customer:
             Database.list) {
            if (customer.getPhoneNumber() !=null && customer.getPhoneNumber().contains(phoneNumber)){
                System.out.println(customer.toStringSearch());
            }
        }
    }
    public void loadData() throws IOException {
        dt.readFile();
    }

    public void printCustomer(String phoneNumber){
        for (Customer customer:
                Database.list) {
            if (customer.getPhoneNumber() !=null && customer.getPhoneNumber().contains(phoneNumber)){
                System.out.println(customer.toString());
            }
        }
    }
    public void addOrder(String phone){
        Scanner sc = new Scanner(System.in);
        for (Customer customer:
                Database.list) {
            if (customer.getPhoneNumber() !=null && customer.getPhoneNumber().contains(phone)){
                System.out.println("Nhập số lượng đơn hàng cần tăng: ");
                int order = sc.nextInt();
                customer.setOrderNumber(order);
                System.out.println("Thông tin sau khi tăng "+ order +  " đơn hàng! ");
                System.out.println(customer.toString());
            }
        }
    }
}
