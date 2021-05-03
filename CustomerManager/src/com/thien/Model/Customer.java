package com.thien.Model;

import java.io.Serializable;

public class Customer implements Serializable {
    private int rollNo;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String gender;
    private int orderNumber;

    public Customer() {
    }

    public Customer(String name, String address, String phoneNumber, String email, String gender) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return rollNo+" Khách Hàng " +
                 name +
                ", Địa Chỉ: " + address  +
                ", Sđt: " + phoneNumber +
                ", Email: " + email  +
                ", Giới Tính: " + gender  +
                ", Số đơn đã mua: " + orderNumber +
                "\n";
    }
    public String toStringCSV(){
        return name+","+address+","+phoneNumber+","+email+","+gender+"\n";
    }
    public String toStringSearch(){
        return rollNo+" Khách Hàng " +
                name +
                ", Địa Chỉ: " + address  +
                ", Sđt: " + phoneNumber +
                ", Email: " + email  +
                ", Giới Tính: " + gender  +
                "\n";
    }
}
