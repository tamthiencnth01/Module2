package com.thien.Dal;

import com.thien.Model.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Database {
    public static ArrayList<Student> list;
    public static int count;
    public static String path = "student.csv";
    static {
        list = new ArrayList<>();
        count = 0;
    }
    public void add(Student student){
        count++;
        student.setRoolNo(count);
        list.add(student);
    }
    public boolean remove(int roolNo){
        boolean result = list.remove(roolNo) == null ? false:true;
        return result;
    }
    public void writeFile() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        for (Student student:
             list) {
            bos.write(student.toStringPoint().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void readFile() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine())!= null){
            String[] arr = line.split(",");
            Student student = new Student(arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),Integer.parseInt(arr[6]),Integer.parseInt(arr[7]),Integer.parseInt(arr[8]));
            add(student);
        }
    }
}
