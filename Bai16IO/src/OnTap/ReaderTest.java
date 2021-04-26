package OnTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String csvFile ="csv.csv";
        File file = new File(csvFile);
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine())!=null){
                String field[] = line.split(",");
                System.out.println("Ip Started: "+field[0]+"Ip End"+field[1]+"start code "+field[2]+"end code "+field[3]+"viet tat"+field[4]+"country "+ field[5]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
