package com.c0221h1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[101];
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            a[i]=a[i]*a[i];
        }
        System.out.println(a);
    }
}
