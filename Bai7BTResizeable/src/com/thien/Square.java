package com.thien;

public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.setLength(side);
    }
    public void setWidth(double side){
        this.setWidth(side);
    }
    public void setLength(double side){
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{"+" color='" + this.getColor() + '\'' +
                (this.isFilled()?" filled ":" not filled ") + " Side: "+ getSide() +"}";
    }

}
