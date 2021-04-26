package ThucHanh02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRamdom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu vao mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        Integer[] arr = example.createRamdom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Vui Long Nhap chi so cua mot phan tu ");
        int x = sc.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5 "+x+" la "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang");
        }
    }
}
