package com.c0221h1;

import java.util.Scanner;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println(iterArr(a));
//        for (int i = 0; i <a.length ; i++) {
//            if (a[i]<a[i+1]){
//                System.out.print("YES");
//            }
//            else System.out.println("NO");
//        }

        test check =new test();
        System.out.println(Arrays.toString(check.oddNumbers()));
        Double[] arr = new Double[1,5,10,-2] [];
        System.out.println(maxMinAvg(arr));
    }
    public static int[] oddNumbers() {
        int[] arr = new int[5];
        int j = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }

        public static Double[] maxMinAvg(Double[] arr) {
            Double[] arrnew = new Double[3];
            Double max = 0d;
            Double min = 0d;
            Double sum = 0d;
            Double avg = 0d;
            for(int i=0;i<arr.length;i++){
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                avg= sum/arr.length;
            }
            arrnew[0]=max;
            arrnew[1]=min;
            arrnew[2]=avg;
            return arrnew;
        }




}
