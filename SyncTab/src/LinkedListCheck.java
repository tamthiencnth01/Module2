import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCheck {
    public static void main(String[] args) {
        //Bai 22
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        LinkedList list = new LinkedList();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//        int k = sc.nextInt();
//        int x = sc.nextInt();
//        list.add(k,x);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
        //Bai 23
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        LinkedList list = new LinkedList();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//        int k = sc.nextInt();;
//        list.remove(k);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
        //Bai 24
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        LinkedList list = new LinkedList();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//        int k = sc.nextInt();
//        System.out.println(list.get(k));
        //Bai 25
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        LinkedList<Integer> list = new LinkedList();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//        int k = sc.nextInt();
//        int x = sc.nextInt();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)==k){
//                list.remove(i);
//                list.add(i,x);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
//          bai26
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        LinkedList<Integer> list = new LinkedList<>();
//        LinkedList<Integer> list1 = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//        int k = sc.nextInt();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)>k){
//                list.remove(i);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
//
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        list.add(k,x);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
