package FileInfoExample;

import java.io.File;
import java.util.Date;

public class FileInfoExample {
    public static void main(String[] args) {
        File file = new File("D:/Module2/IOManager/test.txt");
        System.out.println("kiem tra co ton tai: "+ file.exists());
        if (file.exists()){
            System.out.println("kiem tra co phai foler: "+file.isDirectory());
            System.out.println("kiem tra co phai duong dan ẩn ko: "+file.isHidden());
            System.out.println("lay ten file "+ file.getName());
            System.out.println("duong dan tuyetj doi: "+ file.getName());
            System.out.println("kiem tra kich thuoc: "+file.length()+"byte");
            long lastModifyMillis = file.lastModified();
            Date lastModifyDate = new Date(lastModifyMillis);
            System.out.println("thoi diem sua lan cuoi "+lastModifyDate);
        }
    }
}
