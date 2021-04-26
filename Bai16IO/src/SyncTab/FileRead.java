package SyncTab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        File file;
        FileInputStream fis = null;
        try {
//            fis = new FileInputStream("test.txt");
//            int line;
//            while ((line = fis.read())!=-1){
//                char c = (char) line;
//                System.out.print(c);
//            }
            fis = new FileInputStream("test.txt");
            int line;
            StringBuilder builder = new StringBuilder();
            while ((line = fis.read())!=-1){
                builder.append((char) line);
            }
            String content = builder.toString();
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fis.close();
        }
    }
}
