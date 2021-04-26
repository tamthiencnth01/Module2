public class BinaryKhuDeQuy {
    //private int binarySeach;

    public int binarySeach(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+(right-left))/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]>key){
                right = mid -1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinaryKhuDeQuy khuDeQuy = new BinaryKhuDeQuy();
        int[] arr = {1,2,3,4,5,5,6,8};
//        int n = arr.length;
        int x= 8;
        int check = khuDeQuy.binarySeach(arr,x);
        if (check==-1){
            System.out.println("Khong tim thay");
        }
        else System.out.println("Tim thay "+x+" tai vi tri "+check);
    }
}
