package ex.lab022_collection_framework.c05_map;

import java.util.HashMap;
import java.util.Map;

class MapIterator {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

        //Can access element using advance for loop
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
