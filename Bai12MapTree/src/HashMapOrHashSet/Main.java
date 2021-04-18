package HashMapOrHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Quang Tèo",20,"Huế");
        Student student2 = new Student("Long Còi",18,"huế");
        Student student3 = new Student("Hân PlayBoy",17, "Huế");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        //key ko được trùng nhau
        for (Map.Entry<Integer,Student> student:
             studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("************");
        Set<Student> students = new HashSet<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student:
             students) {
            System.out.println(student.toString());
        }
    }
}
