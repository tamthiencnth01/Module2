package SyncTab;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //File class
//        File file = new File("vidu.txt");
//        if (file.exists()){
//            System.out.println("File ton tai");
//        }
//        else
//        {
//            file.createNewFile();
//            System.out.println("File ko ton tai");
//        }
        File file;
        FileOutputStream fos = null;
        Scanner sc = new Scanner(System.in);
        try{
            fos = new FileOutputStream("test.txt");
//            String line  = "Nguyen Tam Thien";
//            byte[] b= line.getBytes();
//            fos.write(b);
            for (;;){
                System.out.println("Moi ban nhap thong tin");
                String line = sc.nextLine()+"\n";
                byte[] b = line.getBytes();
                fos.write(b);
                System.out.println("ban co muon tiep tuc ko Y/N ");
                String choo = sc.nextLine();
                if (choo.equalsIgnoreCase("n")){
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fos.close();
        }
    }
}
