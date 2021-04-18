package TH01;

import java.util.Collections;

public class test6 {
//    public static void sort_ascending (java.util.ArrayList<Integer> arrayList) {
//        for(int i=0;i<arrayList.size();i++){
//            for(int j=i+1;i<arrayList.size();i++){
//                if (arrayList.get(i)<arrayList.get(j)){
//                    int temp = arrayList.get(i);
//                    arrayList.set(i, arrayList.get(j));
//
//                    arrayList.set(j, temp);
//                }
//            }
//        }
//    }
//    public static <Integer> void reverse_element (java.util.ArrayList<Integer> arrayList) {
//            int temp;
//        for (int i = 0; i < arrayList.size(); i++) {
//            temp = arrayList.get(i);
//            arrayList.set(i, arrayList.get(arrayList.size())-i-1);
//            arrayList.set(arrayList.get(arrayList.size())-i-1,temp);
//        }
//    }
public static <E> void reverse_element (java.util.ArrayList<E> arrayList) {
    Collections.reverse(arrayList);
}
}
