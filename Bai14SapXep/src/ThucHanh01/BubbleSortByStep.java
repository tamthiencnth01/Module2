package ThucHanh01;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
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
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j]>list[j+1]){
                    System.out.println("Swap "+list[j]+" with "+list[j+1]);
                    int temp = list[j];
                    list[j]=list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass==false){
                System.out.println("mảng đã được sắp xếp và ko cần thay đổi");
                break;
            }
            //After sort
            System.out.print("List after the "+i+" 'sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k]+"\t");
            }
            System.out.println();
        }
    }
}
