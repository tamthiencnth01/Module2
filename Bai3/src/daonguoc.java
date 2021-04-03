import java.util.Scanner;

public class daonguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        //Nhập độ dài của mảng
        do {
            System.out.println("Input a size:");
            size = sc.nextInt();
            if (size>20){
                System.out.println("Size khong duoc qua 20!");
            }
        }   while (size>20);
        //Nhập số phần tử của mảng
        array = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter element: "+ (i+1) + ": ");
            array[i]=sc.nextInt();
        }
        //Hiển thị số phần tử trong mảng
        System.out.printf("%-20s%s", "Gia tri trong mang la: ", "");
        for (int j=0;j<size;j++){
            System.out.println(array[j]);
        }
        //Đảo ngược các phần tử trong mảng
        for (int j=0;j<size/2;j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j]=temp;
        }
        //Hiển thị các phần tử đã đảo ngược
        System.out.printf("%-20s%s", "Gia tri trong mang sau khi dao ngược la: ", "");
        for (int j=0;j<size;j++){
            System.out.println(array[j]);
        }
    }
}
