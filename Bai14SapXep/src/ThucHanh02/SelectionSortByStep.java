package ThucHanh02;

import java.util.Scanner;

public class SelectionSortByStep {public static void main(String[] args) {
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
        boolean needNextPass = true;
        for (int i = 0; i < list.length; i++) {
//            needNextPass = false;
            //Tìm số nhỏ nhất trong danh sách
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < list.length ; j++) {
                if (currentMin>list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //đổi chỗ list[i] với list[currentMinIndex] nếu cần thiết
            if (currentMinIndex!=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;

            }
            if (needNextPass==false){
                System.out.println("mảng đã được sắp xếp và ko cần thay đổi");
                break;
            }
            System.out.print("List after the "+i+" 'sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k]+"\t");
            }
            System.out.println();
        }
    }
}
