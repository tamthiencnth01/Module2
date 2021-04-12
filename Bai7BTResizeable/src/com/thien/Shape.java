package com.thien;

public abstract class Shape implements Resizeable{
    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void resize(double percent) {

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                (isFilled()?"filled":"not filled") +
                '}';
    }
    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }
}
