package BaiTap02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExercise {
    public static void main(String[] args) {
        try{
            File f = new File("D:/Module2/IOManager/employee.txt");
            FileWriter fw = new FileWriter(f);
            Employee s[] = {
                    new Employee(1,"Quang Teo",18,10000)
                    ,new Employee(1,"Quang Teo",18,10000)
                    ,new Employee(1,"Quang Teo",18,10000)
            };
            fw.write(String.valueOf(s));
            fw.close();
        }catch (IOException e){
            System.out.println("Loi ghi file: "+e);
        }
    }
}
