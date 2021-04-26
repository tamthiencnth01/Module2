package SyncTab;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        FileReader fr =null;
        BufferedReader bg = null;
        try {
            File file;
            fr = new FileReader("test.txt");
            bg = new BufferedReader(fr);
            String line;
            while ((line = bg.readLine())!=null){
                System.out.println(line);
            }
            fr.close();
            bg.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
