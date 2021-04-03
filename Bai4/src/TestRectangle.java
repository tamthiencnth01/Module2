import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the Width: ");
        double width = sc.nextDouble();
        System.out.println("Input the Height");
        double height = sc.nextDouble();
        THRectangle test = new THRectangle(width,height);
        System.out.println(test.display());
        System.out.println(test.getArea());
        System.out.println(test.getPerimeter());
    }
}
