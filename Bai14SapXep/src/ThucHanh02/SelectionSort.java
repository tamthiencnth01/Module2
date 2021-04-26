package ThucHanh02;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        //Duyệt hết mảng để tìm số nhỏ nhất
        for (int i = 0; i < list.length; i++) {
            //Tìm số nhỏ nhất trong danh sách
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < list.length ; j++) {
                if (currentMin>list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //đổi chỗ list[i] với list[currentMinIndex] nếu cần thiết
            if (currentMinIndex!=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
    }
}
