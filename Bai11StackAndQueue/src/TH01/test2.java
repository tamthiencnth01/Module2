package TH01;
import java.util.Arrays;
public class test2 {
    public static String[] numToStr(int[] arr) {
        String[] arrnew = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arrnew[i]="Dojo";
            }
            else{
                arrnew[i]=String.valueOf(arr[i]);
            }
        }
        return arrnew;
    }

    public static void main(String[] args) {
        int[] arr={1,-2,3,-4,-5};
        String[] check=new String[arr.length];
        test2 entry = new test2();

        check = entry.numToStr(arr);
        System.out.println(Arrays.toString(check));
        //System.out.println();
    }
}
