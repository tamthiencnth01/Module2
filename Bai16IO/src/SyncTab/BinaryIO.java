package SyncTab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryIO {
    public static void main(String[] args) throws IOException {
        //saveFile();
        readFile();
    }
    static void readFile() throws IOException {
        File file;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("data.dat");
            ois = new ObjectInputStream(fis);
            List<Student> list = (List<Student>) ois.readObject();
            for (Student std:
                 list) {
                System.out.println(std);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void saveFile() throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ga",28));
        list.add(new Student("Nu",30));
        list.add(new Student("dep",10));
        list.add(new Student("trai",15));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos!=null){
                fos.close();
            }
            if (oos!=null){
                oos.close();
            }
        }

    }
}
