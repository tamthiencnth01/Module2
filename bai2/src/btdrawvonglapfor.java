import java.util.Scanner;

public class btdrawvonglapfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triagle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        while (true){
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1;i<=6;i++){
                        for (int j = 1;j<i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 6;i>=1;i--){
                        for (int j = 1;j<i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i=1;i<=6;i++)
                    {
                        for(int j=i;j<=6;j++)
                        {
                            System.out.print(" ");
                        }
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
