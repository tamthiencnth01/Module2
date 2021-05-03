import java.util.Scanner;

public class Student {
    String  Name, sex;
    int rollNo, age;

    public Student() {
    }

    public Student(int rollNo, String name, String sex, int age) {
        this.rollNo = rollNo;
        this.Name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return rollNo+","+Name+","+age+","+sex+"\n";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap rollno: ");
        rollNo = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap ten sinh vien: ");
        Name = sc.nextLine();

        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap gioi tinh: ");
        sex = sc.nextLine();
    }
//    public void display(){
//        System.out.println(this);
//    }
}
