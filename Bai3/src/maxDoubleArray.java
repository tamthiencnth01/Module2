import java.util.Scanner;

public class maxDoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        System.out.println("Nhập m:");
        int m = sc.nextInt();
        int[][] myNumbers = new int[n][m];
        for (int i=0;i<myNumbers.length;i++){
            for (int j=0;j<myNumbers[i].length;j++){
                myNumbers[i][j]=(int) Math.round(Math.random()*100);
            }
        }
        for (int i=0;i<myNumbers.length;i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
        //Tìm phần tử lớn nhất trong mảng
        System.out.println("Giá trị lớn nhất trong mảng hai chiều là: " + maxDoubleArray(myNumbers));
    }
    static int maxDoubleArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
