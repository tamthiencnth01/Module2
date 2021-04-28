package BaiTap01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InOutStudent {
    private static final String FILE_NAME = "student.txt";
    public void write(List<Student> studentList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File file;
            fos = new FileOutputStream(FILE_NAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            fos.close();
            oos.close();
        }
    }
    public List<Student> read() throws IOException {
        List<Student> list = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file;
            fis = new FileInputStream(FILE_NAME);
            ois = new ObjectInputStream(fis);
            list = (List<Student>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            fis.close();
            ois.close();
        }return list;
    }
}
