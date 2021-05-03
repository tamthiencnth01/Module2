package com.student.dal;

import com.student.model.Student;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentIO {
    public static String path = "student.csv";
    public static void write(Map<Integer, Student> list) throws IOException {
        FileWriter fileWriter =null;
        BufferedWriter bw = null;
        StringBuilder sb = new StringBuilder();
        try  {
            fileWriter = new FileWriter(path,true);
            bw = new BufferedWriter(fileWriter);
            for (Map.Entry<Integer, Student> student:
                 list.entrySet()) {
                sb.append(student.getValue());
            }
            bw.write(String.valueOf(sb));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bw.flush();
            bw.close();
        }
    }
    public static Map<Integer, Student> read() throws IOException {
        Map<Integer, Student> list = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine())!=null) {
                String[] arr = line.split(",");
                 //   list.put(Integer.parseInt(arr[0]),new Student(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3])));
                System.out.println(Arrays.toString(arr));
                }
              //  System.out.println(Arrays.toString(str));
               // System.out.println(new Student(Integer.parseInt(str[0].trim()),str[1].trim(),str[2].trim(),Integer.parseInt(str[3].trim())));

        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            br.close();
            return list;
        }


    }
}
