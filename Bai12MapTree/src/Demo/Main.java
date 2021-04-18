package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(20,"Quang");
        Employee employee2 = new Employee(18,"Long");
        Employee employee3 = new Employee(19,"Han");
        Map<Integer, String> map = new HashMap<>();
        map.put(31,"employee1");
        map.put(23,"employee2");
        map.put(35,"employee3");
        map.put(41,"employee1");
        for (Map.Entry<Integer,String> entry:
             map.entrySet()) {
            System.out.println(entry.toString());
        }
        Map map1 = new TreeMap(map);
        System.out.println(map1);
    }
}
