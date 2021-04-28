package BaiTap03;

import java.io.*;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        int[] list = new int[10];
        try {
            File file;
            fos = new FileOutputStream("sum.txt");
            //dos = new DataOutputStream(fos);

            for (int i=0;i< list.length;i++){
                System.out.println("Nhap thong tin :");
                Integer number = sc.nextInt();

                fos.write(number.toString().getBytes());
                System.out.println("Ban co muon tiep tuc Y/N");
                String choose = sc.nextLine();
                if (choose.equalsIgnoreCase("n")){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fos.close();
        }
    }
}
