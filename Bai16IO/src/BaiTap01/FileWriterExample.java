package BaiTap01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            File f = new File("D:/Module2/IOManager/mydata3.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("Ghi dữ liệu bằng luồng character");
            fw.close();
        }catch (IOException e){
            System.out.println("loi ghi file: "+e);
        }
    }
}
