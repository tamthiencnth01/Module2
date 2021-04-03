import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return ((-b) + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
    }

    public double getRoot2() {
        return ((-b) + (Math.sqrt(b * b + 4 * a * c))) / (2 * a);
    }
    public double getRoot3(){
        return ((-b)/(2*a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a:");
        int number1 = sc.nextInt();
        System.out.println("Nhap gia tri b:");
        int number2 = sc.nextInt();
        System.out.println("Nhap gia tri c:");
        int number3= sc.nextInt();
        QuadraticEquation quadratic = new QuadraticEquation(number1, number2, number3);
        double delta =  quadratic.getDiscriminant();
        System.out.println("Delta se la: "+delta);
        if (delta>0){
            System.out.println("Phuong trinh se co 2 nghiem la:"+quadratic.getRoot1()+" & "+quadratic.getRoot2());
        }
        if (delta==0){
            System.out.println("Phuong trinh co 2 nghiem kep la: "+ quadratic.getRoot3());
        }
        if (delta<0){
            System.out.println("The equation has no roots");
        }
    }
}
