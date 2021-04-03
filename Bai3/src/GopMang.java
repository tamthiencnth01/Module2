import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] myNumbers1 = new int[size1];
        int[] myNumbers2 = new int[size2];
        for (int i=0;i<size1;i++){
            myNumbers1[i]=(int) Math.round(Math.random()*100);
        }
        for (int i=0;i<size2;i++){
            myNumbers2[i]=(int) Math.round(Math.random()*100);
        }
        for (int i=0;i<size1;i++){
            System.out.print(myNumbers1[i]+" ");
        }
        System.out.println();
        for (int i=0;i<size2;i++){
            System.out.print(myNumbers2[i]+" ");
        }
        System.out.println();

        int[] myNumbers3 = merge(myNumbers1,myNumbers2);
        for (int i=0;i<myNumbers3.length;i++){
            System.out.print(myNumbers3[i]+ " ");
        }
    }

    public static int[] merge(int[] myNumbers1,int[] myNumbers2){
        int[] myNumbers3 = new int[myNumbers1.length + myNumbers2.length];
        for (int i=0;i< myNumbers1.length;i++){
            myNumbers3[i] = myNumbers1[i];
        }
        int j = myNumbers1.length;
        for(int i= 0;i<myNumbers2.length;i++){
            myNumbers3[j] = myNumbers2[i];
            j++;
        }
        return myNumbers3;
    }
}
