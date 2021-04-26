public class Synctab {
    static int[] list = {84,58,69,24,36,42,64,58,1};
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length&&needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass=true;
                }
            }
        }
    }

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j=i-1;
            while (j>=0&&list[j]>key){
                list[j+1] = list[j];
                j--;
            }
            list[j+1]=key;
        }
    }

    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (min>list[j]){
                    min=list[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                list[minIndex]=list[i];
                list[i] = min;
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println("\n**************");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
        }
        System.out.println("\n*****************");
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }
}
