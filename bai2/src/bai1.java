import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number + "ko phai so nguyen to");
        }else {
            int i=2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number %i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + "la so nguyen to");
            }else {
                System.out.println(number + "ko phai la so nguyen to");
            }
        }
    }
}