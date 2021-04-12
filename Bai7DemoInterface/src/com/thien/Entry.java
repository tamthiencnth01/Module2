package com.thien;

public class Entry {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*100);
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(x);
        shapes[1] = new Rectangle(x,x);
        shapes[2] = new Cylinder(x,x);
        shapes[3] = new Rectangular(x,x,x);
        for (Shape shape:
             shapes) {
            System.out.println("****************************************");
            shape.display();
            
        }
    }
}
