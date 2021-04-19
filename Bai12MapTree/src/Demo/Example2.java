package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Dont use Generic
public class Example2 {
    public static void main(String[] args) {
        // init map
        HashMap map = new HashMap();
        // add elements to map
        map.put("5abc", "Java");

        map.put(3, "C++");
        map.put(2, "PHP");
        map.put(4, "Python");
        // show Map
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
