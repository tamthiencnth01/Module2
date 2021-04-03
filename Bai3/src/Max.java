import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        //Nhap do dai cua mang va ko qua 20
        do {
            System.out.println("Nhap size: ");
            size = sc.nextInt();
            if (size>20)
                System.out.println("Size khong duoc qua 20");
            } while (size>20);
        //Nhap gia tri cho mang
        array = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Nhap gia tri: "+ (i+1) + ":");
            array[i]=sc.nextInt();
        }
        //Hiển thị tất cả giá trị trong mảng là:
        System.out.println("Danh sach trong mang la:");
        for (int j = 0;j<size;j++){
            System.out.println(array[j] + " ");
        }
        //Tìm giá trị lớn nhất trong mảng
        int max = array[0];
        int index = 1;
        for (int k=0;k<size;k++){
            if (array[k]>max){
                max = array[k];
                index=k+1;
            }
        }
        System.out.println("Gia tri lon nhat trong mang la:"+ max + " chi so la" +index);
    }
}
