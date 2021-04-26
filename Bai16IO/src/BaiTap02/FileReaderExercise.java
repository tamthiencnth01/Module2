package BaiTap02;

import java.io.*;

public class FileReaderExercise {
    public static void main(String[] args) throws IOException {
        try{
            File f =new File("D:/Module2/IOManager/employee.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br =new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch(Exception e){
        System.out.println("Loi doc file "+e);
        }
    }
}
