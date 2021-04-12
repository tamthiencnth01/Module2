package com.thien;

public class Cylinder extends Circle implements VolumeShape{
    protected double heightCylinder;

    public Cylinder() {
    }

    public Cylinder(double radius, double heightCylinder) {
        super(radius);
        this.heightCylinder = heightCylinder;
    }

    public double getHeightCylinder() {
        return heightCylinder;
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    @Override
    public double getVolume() {
        return this.radius*this.radius*this.heightCylinder*Math.PI;
    }
    public void display(){
        System.out.println("Cylinder is: ");
        System.out.println("Radius is: "+this.radius);
        System.out.println("Area of Cylinder is: "+getArea());
        System.out.println("Perimeter of Cylinder is: "+getPerimeter());
        System.out.println("Volume of Cylinder is: "+getVolume());
    }
}
