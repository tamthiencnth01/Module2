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
        test.put(65,"Khanh");
        test.put(65,null);
        test.put(23,"Quang");
        test.put(43,"Long");
        test.put(44,null);
        test.put(32,"Han");
        test.put(91,null);
        test.put(20,"Nam");
        for (Integer key:
             test.keySet()) {
            String value = test.get(key);
            System.out.println(key+"----------"+value);
        }
        for (Map.Entry<Integer, String> entry :
                test.entrySet()) {
            System.out.println(entry.getKey()+"*************"+entry.getValue());
        }
    }
}
