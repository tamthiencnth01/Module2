package FileInfoExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFolderExample {
    public static void main(String[] args) throws IOException {
        File sourceDir = new File("D:/Module2/IOManager/TestCopy");
        File destDir = new File("C:/New folder");
        copyDirectory(sourceDir,destDir);
    }
    public static void copyDirectory(File soureDir, File destDir) throws IOException{
        if (!destDir.exists()){
            destDir.mkdirs();
        }
        if (!soureDir.exists()){
            throw new IllegalArgumentException("soureDir does not exist");
        }
        if (!soureDir.exists()||destDir.exists()){
            throw new IllegalArgumentException("mot trong hai thu muc ko co san");
        }
        doCopyDirectoryImple(soureDir,destDir);
    }
    private static void doCopyDirectoryImple(File sourDir, File destDir) throws IOException{
        File[] items = sourDir.listFiles();
        if (items!=null&&items.length>0){
            for (File item:
                 items) {
                if (item.isDirectory()){
                    File newDir = new File(destDir, item.getName());
                    System.out.println("Tao thu muc: "+newDir.getAbsolutePath());
                    newDir.mkdirs();
                    doCopyDirectoryImple(item,newDir);
                }
                else {
                    File destFile = new File(destDir,item.getName() );
                    doCopySingleFile(item, destFile);
                }
            }
        }
    }
    private static void doCopySingleFile(File sourceFile, File destFile)throws IOException{
        if (!destFile.exists()){
            destFile.createNewFile();
        }
        FileChannel sourChannel = null;
        FileChannel destChannel = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file;
            fis = new FileInputStream(sourceFile);
            fos =new FileOutputStream(destFile);
            sourChannel = fis.getChannel();
            destChannel = fos.getChannel();
            sourChannel.transferTo(0, sourChannel.size(), destChannel);
        }finally {
            if (fis!=null){
                fis.close();
            }
            if (fos!=null){
                fos.close();
            }
            if (sourChannel!=null){
                sourChannel.close();
            }
            if (destChannel !=null){
                destChannel.close();
            }
        }
    }
}
