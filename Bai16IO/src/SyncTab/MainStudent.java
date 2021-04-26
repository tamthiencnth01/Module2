package SyncTab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ga",28));
        list.add(new Student("Nu",30));
        list.add(new Student("dep",10));
        list.add(new Student("trai",15));
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("test.txt");
            String line = Student.getHeaderFormat()+"\n";
            byte[] b = line.getBytes();
            fos.write(b);
            for (Student std:
                 list) {
                line = std.getFileLineFormat()+"\n";
                b = line.getBytes();
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                fos.close();
            }
        }
    }
}
