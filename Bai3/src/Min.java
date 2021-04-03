import java.util.Scanner;

public class Min {
    public static void min(int[] arr){
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là:" + min);
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        int n = sc.nextInt();
        //System.out.println("Nhap gia tri cua mang");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri cua mang");
            arr[i] = sc.nextInt();
        }
        min(arr);
        System.out.println("Giá trị lớn nhất trong mảng là:" +max(arr));
    }
}
