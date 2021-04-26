package OnTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
                FileOutputStream fos = null;
        try{
            File file;
            fos = new FileOutputStream("file.txt",true);
            for (;;){
                System.out.println("moi ban nhap thong tin");
                String line = sc.nextLine()+"\n";
                byte[] b = line.getBytes();
                fos.write(b);
                System.out.println("Ban co muon tiep tuc ko Y/N");
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
