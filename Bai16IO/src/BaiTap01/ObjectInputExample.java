package BaiTap01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/Module2/IOManager/mydata2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Stock sArr[] = (Stock[]) ois.readObject();
            for (Stock s:
                 sArr) {
                System.out.println(s.toString());
            }
            fis.close();
            ois.close();
        }catch (Exception e){
            System.out.println("Loi doc file: " +e);
        }
    }
}
