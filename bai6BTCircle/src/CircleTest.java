public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5,"indigo");
        System.out.println(circle);
        System.out.println("Dien tich hinh tron" + circle.getArea());
    }
}
