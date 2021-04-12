package com.thien;

public class Rectangle implements Shape{
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length+this.width)*2;
    }

    @Override
    public void display() {
        System.out.println("Rectangle is: ");
        System.out.println("Width is: "+this.width);
        System.out.println("Length is: "+this.length);
        System.out.println("Area of Rectangle is: "+getArea());
        System.out.println("Perimeter of Rectangle is: "+getPerimeter());
    }
}
