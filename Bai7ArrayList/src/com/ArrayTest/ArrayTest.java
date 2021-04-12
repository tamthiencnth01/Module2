package com.ArrayTest;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,3,6,4,5,7,4,3,2};
            for (int i = 0; i < arr.length - 1 ; i++) {
                for (int j = i+1; j < arr.length ; j++) {

                    if (arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i]= arr[j];
                        arr[j] = temp;
                    }
                }
        }
        System.out.println(Arrays.toString(arr));
    }



}
