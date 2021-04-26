public class Linear {
    public static void main(String[] args) {
        int[] arr = {3,3,2,5,6,2,1,6,5,2,3};
        int x = 5;
            System.out.print(searchIndex(arr)+" ");

    }
    public static int searchIndex(int[] arr){
        int minIndex = 0;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]<arr[minIndex]){
                minIndex = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
        minIndex =1;
        for (int i = 1; i < n; i++) {
            if (arr[i]<arr[minIndex]){
                minIndex = i;
            }
        }
        return arr[minIndex];
    }
    public static int secondMin(int[] arr){
        int min = searchIndex(arr);
        int scMin = arr[0];
        for (int i = min+1; i < arr.length; i++) {
            if (min<scMin){
                arr[i] = scMin;
            }
        }
        return scMin;
    }

}
