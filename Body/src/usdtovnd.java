import java.util.Scanner;

public class usdtovnd {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD:");
        usd = sc.nextDouble();
        double change = usd*23000;
        System.out.println("Gia tri VND:"+change);
    }
}
