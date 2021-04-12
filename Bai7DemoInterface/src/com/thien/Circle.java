package com.thien;

public class Circle implements Shape{
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public void display() {
        System.out.println("Circle is: ");
        System.out.println("Radius is: "+this.radius);
        System.out.println("Area of Circle is: "+getArea());
        System.out.println("Perimeter of Circle is: "+getPerimeter());
    }
}
