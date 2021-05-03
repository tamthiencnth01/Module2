package Dal;

import Model.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DatabaseStudent {
    public static String path = "data.csv";
    public static Map<Integer, Student> studentMap;
    public static int count;
    static {
        studentMap = new HashMap<>();
        count=0;
    }
    public void add(Student student){
        count++;
        student.setId(count);
        studentMap.put(count,student);
    }
    public boolean remove(int id){
        boolean result = studentMap.remove(id) == null ? false:true;
        return result;
    }
    public void writeFile() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        for (Map.Entry<Integer,Student> entry:
             studentMap.entrySet()) {
            bos.write(entry.getValue().toString().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void readFile() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine())!=null){
            String[] str = line.split(",");
            Student student = new Student(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),str[3]);
            add(student);
        }
    }
}
