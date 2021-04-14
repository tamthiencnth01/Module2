package TH01;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean firstCheck = true;
        boolean secondCheck = true;
        for(int i=1;i<=a.length-1;i++){
            if(a[i]<=a[i-1]) firstCheck=false;
            if(a[i]>=a[i-1]) secondCheck=false;
        }
        if (firstCheck==true || secondCheck==true){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
