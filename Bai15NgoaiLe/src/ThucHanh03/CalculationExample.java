package ThucHanh03;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap x: ");
        int x= sc.nextInt();
        System.out.println("Hay nhap y ");
        int y = sc.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculate(x,y);
    }
    private void calculate(int x, int y){
        try {
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("Tong x+y= "+a);
            System.out.println("Hieu x-y= "+b);
            System.out.println("Tich x*y= "+c);
            System.out.println("Thuong x/y= "+d);
        }catch (Exception e){
            System.err.println("xay ra ngoai le "+e.getMessage());
        }
    }
}
