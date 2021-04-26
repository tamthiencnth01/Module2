package BaiTap01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("D:/Module2/IOManager/mydata2.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock s[]={
                    new Stock(1,"CPU",100,2)
                    ,new Stock(2,"Main",500,2)
                    ,new Stock(3,"Ram",75,1)
            };
            oos.writeObject(s);
            fos.close();
            oos.close();
         }catch (IOException e){
            System.out.println("Loi ghi file: "+e);
        }
    }
}
