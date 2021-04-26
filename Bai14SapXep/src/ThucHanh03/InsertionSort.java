package ThucHanh03;

public class InsertionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void insertionSort(double[] list){
        for (int i = 1; i < list.length; i++) {
            double key = list[i];
            int j = i-1;
            //So sánh và đảo 2 cặp lại với nhau
            while (j >=0&&list[j]>key){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println("*****************");;
        sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"   ");
        }
    }
    public static void sort(double[] list){
        for (int i =1; i < list.length; i++) {
            double key  =list[i];
            for (int j = i-1; list[i]>key ; j--) {
                list[j+1]= list[j];
            }
        }
    }
}
