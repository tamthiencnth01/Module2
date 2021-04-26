package BaiTap;

public class BinarySearch {
    public int binarySearch(int[] array, int n, int low, int high){
        if (high>=low){
            int mid = low+(high-low)/2;

            if (array[mid]==n)
                return mid;
            if (array[mid]>n)
                return binarySearch(array,n,low,mid-1);
            return binarySearch(array, n, mid+1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int arr[] = {3,4,5,6,7,8,9};
        int n = arr.length;
        int x = 8;
        int result = search.binarySearch(arr,x,0,n-1);
        if (result==-1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index "+result);
    }
}
