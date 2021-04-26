package Synctab;

public class KhuDeQuy {
    public static int binarySeach(int[] arr, int key){
       int left = 0;
       int right =arr.length-1;
       while (left<=right){
           int mid = (left+right)/2;
           if (mid == key){
               return mid;
           }
           if (mid>key){
               right = mid -1;
           }
           left = mid +1;
       }
       return -1;
    }
    static int[] arr = {1,2,3,4,5,6,8};
    public static void main(String[] args) {
        System.out.println(binarySeach(arr,8));
    }
}
