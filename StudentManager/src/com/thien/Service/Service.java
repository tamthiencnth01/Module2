package com.thien.Service;

import com.thien.Dal.Database;
import com.thien.Model.Student;

import java.io.IOException;
import java.util.Comparator;

public class Service {
    public Database dt = new Database();
    public void add(Student student) throws IOException {
        dt.add(student);
        dt.writeFile();
    }
    public void print(){
        for (Student student:
             Database.list) {
            System.out.printf("%5d | ",student.getRoolNo());
            System.out.printf("%20s | ",student.getName());
            System.out.printf("%5d| ",student.getAge());
            System.out.printf("%5s | ",student.getGender());
            System.out.printf("%5d| ",student.getFirstPoint());
            System.out.printf("%5d| ",student.getSecondPoint());
            System.out.printf("%5d| ",student.getThirdPoint());
            System.out.printf("%5d| ",student.getFourthPoint());
            System.out.printf("%5d| ",student.getAveragePoint());
            System.out.println();
        }
    }
    public void loadData() throws IOException {
        dt.readFile();
    }
    public Student find(int id){
        return Database.list.get(id);
    }
    public void updateData() throws IOException {
        dt.writeFile();
    }
    public boolean removeStudent(int id) throws IOException {
        boolean result = dt.remove(id);
        dt.writeFile();
        return result;
    }

    public int compare(Student o1, Student o2) {
        if (o1.getAveragePoint()>o2.getAveragePoint()){
            return 1;
        }
        return -1;
    }


}
