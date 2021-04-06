public class Triangle {
    private double side1, side2, side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        double perimeter =  this.side1*this.side2*this.side3;
        return perimeter;
    }
    public double getArea(){
        double area =  Math.PI(getPerimeter()*(getPerimeter()-this.side1)*(getPerimeter()-this.side2)*(getPerimeter()-this.side3);
        return area;
    }
}
