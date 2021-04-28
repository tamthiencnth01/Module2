package BaiTap03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        File file;
        FileInputStream fis = new FileInputStream("sum.txt");
        int line;
        while ((line = fis.read())!=-1){
            char c = (char) line;
            System.out.print(c);
        }
    }
}
