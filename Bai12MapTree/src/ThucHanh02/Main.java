package ThucHanh02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Quang",30,"Huế");
        Student student1 = new Student("Long",36,"Huế");
        Student student2 = new Student("Chương",28,"Huế");
        Student student3 = new Student("Nam",25,"Huế");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st:
             list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student st:
             list) {
            System.out.println(st.toString());
        }
    }
}
