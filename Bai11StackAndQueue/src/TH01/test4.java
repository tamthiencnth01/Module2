package TH01;

import java.util.Scanner;
import java.util.Arrays;
public class test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            b[i]=sc.nextInt();
        }
        int[] c =new int[m+n];
        for (int i = 0; i <m+n ; i++) {
            if(i<a.length){
                c[i]=a[i];
            }
            else c[i]=b[i-a.length];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
