package Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example4 {
    public static void main(String[] args) {
        //Use HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        //Lưu trữ ngẫu nhiên, không thể sắp xếp
        hashMap.put("Anderson", 1);
        hashMap.put("Smith", 4);
        hashMap.put("Lewis", 3);
        hashMap.put("Cook", 8);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        //Use TreeMap
        //Tự động sắp xếp tăng dần theo key, có thể sắp xếp
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        //Use LinkedHashMap
        //Lưu trữ theo thứ tự chèn, có thể sắp xếp
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 30);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
