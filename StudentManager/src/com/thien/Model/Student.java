package com.thien.Model;

import java.io.Serializable;

public class Student implements Serializable {
    private int roolNo;
    private String name;
    private int age;
    private String gender;
    private int firstPoint;
    private int secondPoint;
    private int thirdPoint;
    private int fourthPoint;
    private int averagePoint;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.roolNo = roolNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(String name, int age, String gender, int firstPoint, int secondPoint, int thirdPoint, int fourthPoint, int averagePoint) {
        this.roolNo = roolNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fourthPoint = fourthPoint;
        this.averagePoint = averagePoint;
    }


    public int getRoolNo() {
        return roolNo;
    }

    public void setRoolNo(int roolNo) {
        this.roolNo = roolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(int firstPoint) {
        this.firstPoint = firstPoint;
    }

    public int getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(int secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(int thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public int getFourthPoint() {
        return fourthPoint;
    }

    public void setFourthPoint(int fourthPoint) {
        this.fourthPoint = fourthPoint;
    }

    public int getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(int averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return roolNo +
                "," + name +
                "," + age +
                "," + gender +
                "\n";
    }


    public String toStringPoint() {
        return roolNo +
                "," + name +
                "," + age +
                "," + gender +
                "," + firstPoint +
                "," + secondPoint +
                "," + thirdPoint +
                "," + fourthPoint +
                ","+averagePoint+
                "\n";
    }
}
