import BaiTap.BinarySearch;

public class SyncTab {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left<=right){
            int mid = (left+(right-left))/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid]>key){
                return binarySearch(arr, left, mid -1,key);
            }
            return binarySearch(arr, mid+1,right,key);
        }
        return -1;
    }


    public static void main(String[] args) {
        SyncTab search = new SyncTab();
        int[] arr = {1, 2, 3, 4, 5, 6, 7 , 8 , 9};
        int n=arr.length;
        int x = 1;
        int result = search.binarySearch(arr,0,n-1,x);
        if (result!=-1){
            System.out.println("Phan tu "+x+" duoc tim thay tai vi tri "+result);
        }
        else
            System.out.println("Khong tim thay");
    }
}
