package com.thien.Dal;

import com.thien.Model.Customer;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public static ArrayList<Customer> list;
    public static int count;
    public static String path ="customer.csv";
    static {
        list = new ArrayList<>();
        count = 0;
    }
    public void add(Customer customer){
        count++;
        customer.setRollNo(count);
        list.add(customer);
    }
    public boolean remove(int phoneNumber){
        boolean result = list.remove(phoneNumber) == null?false:true;
        return result;
    }
    public void writeFile() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        for (int i = 0; i < list.size(); i++) {
            bos.write(list.get(i).toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void readFile() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine())!= null){
            String[] arr = line.split(",");
            Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4]);
            add(customer);
        }
    }
}
