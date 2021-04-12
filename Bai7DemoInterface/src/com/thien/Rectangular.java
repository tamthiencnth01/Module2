package com.thien;

public class Rectangular extends Rectangle implements VolumeShape{

    protected double height;

    public Rectangular() {
    }

    public Rectangular(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea()*this.height;
    }
    public void display(){
        System.out.println("Rectangular is: ");
        System.out.println("Width is: "+this.width);
        System.out.println("Length is: "+this.length);
        System.out.println("Area of Rectangular is: "+getArea());
        System.out.println("Perimeter of Rectangular is: "+getPerimeter());
        System.out.println("Volume of Rectangular is: "+getVolume());
    }
}
