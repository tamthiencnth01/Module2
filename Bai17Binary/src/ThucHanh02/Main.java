package ThucHanh02;

import BaiTap01.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writer(String path, Employee employee) throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.flush();
        fos.close();
        oos.close();
    }
    public static Employee read(String path) throws Exception {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee epy = null;
        if (fis.available()>0){
            epy = (Employee) ois.readObject();
        }
        return epy;
    }
    public static void appendArray(ArrayList employees, String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employees);
        oos.flush();

        fos.close();
        oos.close();
    }
    public static ArrayList<Employee> readAllObject(String path) throws IOException, ClassNotFoundException {
        ArrayList<Employee> list = new ArrayList<>();
        File file;
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        if (fis.available()>0){
            list = (ArrayList<Employee>) ois.readObject();
        }
        ois.close();
        return list;
    }
    public static void createFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()){
            System.out.println("File is not exists");
        }else file.createNewFile();
    }
    public static void writerCSV(String path, ArrayList<Employee> employees) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        StringBuilder sb = new StringBuilder();
        for (Employee e:
             employees) {
            sb.append(e.toString());
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
    public static ArrayList<Employee> readerCSV(String path) throws IOException {
        Reader in;
        ArrayList<Employee> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine())!=null){
            String[] str = line.split(",");
            list.add(new Employee(str[0],Integer.parseInt(str[1]), str[2]));
        }
        br.close();
        return list;

    }
    public static void main(String[] args) throws Exception {
        try{
            ArrayList<Employee> list = new ArrayList<>();
            list.add(new Employee("Quang Teo", 91, "19200"));
            list.add(new Employee("Binh Teo", 91, "19200"));
            list.add(new Employee("Han Bi De", 91, "19200"));
            list.add(new Employee("Long Dep ", 91, "19200"));
            list.add(new Employee("Binh Teo", 91, "19200"));
//            String path = "employee.dat";
//            appendArray(list,path);
            String pathCSV = "employee.csv";
            writerCSV(pathCSV,list);
            System.out.println(readerCSV(pathCSV).toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
