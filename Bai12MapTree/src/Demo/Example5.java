package Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        System.out.println("HashMap - trả về thứ tự ngẫu nhiên");
        testMap(hashMap);
        System.out.println("LinkedHashMap - Nhập vào sao thì in ra như vậy!");
        testMap(linkedHashMap);
        System.out.println("TreeMap - Sắp xếp theo thứ tự tăng dần");
        testMap(treeMap);
    }
    public static void testMap(Map<Integer, String> test){
        test.put(11,"Duong");
        test.put(51,"Khanh");
        test.put(65,"Chuong");
        test.put(72,"Quang");
        test.put(101,"Long");
        test.put(44,"Han");
        test.put(32,"Huy");
        test.put(91,"Binh");
        test.put(20,"Nam");
        for (Integer key:
             test.keySet()) {
            String value = test.get(key);
            System.out.println(key+"----------"+value);
        }
    }
}
