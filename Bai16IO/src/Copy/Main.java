package Copy;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream("1.jpg");
            bis = new BufferedInputStream(fis);

            File file;
            fos = new FileOutputStream("4.jpg");
            bos = new BufferedOutputStream(fos);
            byte[] b = new byte[1024];
            int line;
            while ((line = fis.read(b))!=-1){
                bos.write(b,0,line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bis.close();
            bos.close();
        }


    }
}
