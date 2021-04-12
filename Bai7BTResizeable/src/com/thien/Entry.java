package com.thien;

public class Entry {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow",false,x);
        shapes[1] = new Rectangle("melinda",true,x,x);
        shapes[2] = new Square("green",false,x);
        for (Shape shape:
             shapes) {
            System.out.println(shape);
            
        }
        System.out.println();
        for (Shape shape:
             shapes) {shape.resize(100);
            
        }
        System.out.println();
        Shape.printShape(shapes);
    }
}
