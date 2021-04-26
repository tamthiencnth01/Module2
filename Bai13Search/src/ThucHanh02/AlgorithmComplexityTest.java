package ThucHanh02;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii =(int) input.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i]>max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("Cac ky tu duoc nhap "+character+" with a frequency of "+ max+ " times");
    }
}
