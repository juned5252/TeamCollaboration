package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NY");
        map.put(2, "VA");
        map.put(3, "PA");
        System.out.println(map.get(2));
        for(Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}

