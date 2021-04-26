package ThucHanh03;

import java.util.Scanner;

public class InsertSortByStep {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter list size: ");
    int size = sc.nextInt();
    int[] list = new int[size];
    System.out.println("Enter "+ list.length+ " values: ");
    for (int i = 0; i < list.length; i++) {
        list[i] = sc.nextInt();
    }
    System.out.println("Your input list: ");
    for (int i = 0; i < list.length; i++) {
        System.out.print(list[i]+"\t");
    }
    System.out.println("\nBegin sort processing....");
    selectionSortByStep(list);
}
    public static void selectionSortByStep(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i-1;
            //Di chuyển các phần tử lớn hơn key đến vị trí cuối
            while (j >=0&&list[j]>key){
                list[j+1] = list[j];
                j=j-1;
            }
            list[j+1] = key;
            System.out.print("List after the "+i+" 'sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k]+"\t");
            }
            System.out.println();
        }
    }
}
