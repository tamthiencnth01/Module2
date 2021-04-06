public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    protected double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return this.radius*this.radius*3.14;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle Circle = new Circle(15);
        System.out.println("Ban Kinh la: " + Circle.getRadius());
        System.out.println("Dien tich hinh tron la: " + Circle.getArea());
    }
}
