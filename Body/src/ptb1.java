import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println(("a:"));
        a = sc.nextDouble();
        System.out.println("b:");
        b = sc.nextDouble();
//        System.out.println("c:");
//        c = sc.nextDouble();
        if (a!=0){
            double answer = -b/a;
            System.out.println("Phuong trinh co nghiem :" + answer);
        }else {
            if (b==0) {
                System.out.println("Phuong trinh co vo so nghiem:");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
