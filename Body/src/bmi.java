import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Can nang cua ban la:");
        weight = scanner.nextDouble();
        System.out.println("Chieu cao cua ban la:");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-10s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-10.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-10.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-10.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-10.2f%s", bmi, "Obese");
    }
}
