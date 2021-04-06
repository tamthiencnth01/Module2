public class Circle extends Shape{
    private double radius =1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,  String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimetert(){
        return radius*2*Math.PI;
    }
    public String toString(){
        return "A Circle with radis="+ getRadius() + ", which is a subclass of "+super.toString();
    }
}
