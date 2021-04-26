package BaiTap01;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("D:/Module2/IOManager/mydata.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(100);
            dos.writeDouble(9.5);
            fos.close();
            dos.close();
            System.out.println("Done!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
