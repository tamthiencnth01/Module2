package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Use Generic
public class Example1 {
    public static void main(String args[]) {
        // init map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
