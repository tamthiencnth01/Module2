public class BinarySeach {
    public static int binarySearch(int[] arr, int x, int left, int right){
        if (left>right) return -1;
        int mid = left +(right-left)/2;
        if (arr[mid]==x) return mid;
        if (arr[mid]>x) return binarySearch(arr, x, left, mid -1);
        else return binarySearch(arr, x, mid+1, right);
    }
    public static int khuDeQuy(int[] arr, int key){
        int left = 0;
        int right = arr.length -1;
        while (left<=right){
            int mid = left +(right-left)/2;
            if (arr[mid] == key) return mid;
            if (arr[mid]>key) right = mid -1;
            else left = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9,10};
        int x = 3;
        System.out.println(binarySearch(arr,x, 0, arr.length-1));
        System.out.println(khuDeQuy(arr,6));
    }
}
