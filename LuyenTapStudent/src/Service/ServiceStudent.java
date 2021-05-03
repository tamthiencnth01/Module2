package Service;

import Dal.DatabaseStudent;
import Model.Student;

import java.io.IOException;
import java.util.Map;

public class ServiceStudent {
    public DatabaseStudent std = new DatabaseStudent();
    public void add(Student student) throws IOException {
        std.add(student);
        std.writeFile();
    }
    public void updateFile() throws IOException {
        std.writeFile();
    }
    public boolean remove(int id) throws IOException {
        boolean result = std.remove(id);
        std.writeFile();
        return result;
    }
    public Student find(int id){
        return DatabaseStudent.studentMap.get(id);
    }
    public void print(){
        for (Map.Entry<Integer,Student> entry:
             DatabaseStudent.studentMap.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue().toString());
        }
    }
    public void loadData() throws IOException {
        std.readFile();
    }
}
