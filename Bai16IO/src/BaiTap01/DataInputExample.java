package BaiTap01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputExample {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("D:/Module2/IOManager/mydata.bin");
            DataInputStream dis = new DataInputStream(fis);
            int n = dis.readInt();
            double m = dis.readDouble();
            fis.close();
            dis.close();
            System.out.println("So nguyen: "+ n);
            System.out.println("So thucc: "+m);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
