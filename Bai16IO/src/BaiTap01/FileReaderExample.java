package BaiTap01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            File f = new File("D:/Module2/IOManager/mydata3.txt");
            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            fr.close();
            br.close();
        }catch (Exception e){
            System.out.println("Loi doc file: "+e);
        }
    }
}
