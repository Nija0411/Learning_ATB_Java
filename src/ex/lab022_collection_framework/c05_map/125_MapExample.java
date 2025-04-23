package ex.lab022_collection_framework.c05_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MapExample {
    public static void main(String[] args) {

        //Map:
        //1. Elements are stored in key & value pair. (Ex: name (key) Nikhita (value))

        // HashMap :
        //1. Doesn't maintain any order
        //2. Duplicate values are allowed but not the keys.
        //3. Only 1 null key and multiple null values are allowed
        //4. Duplicate keys are not allowed — last value will overwrite previous one.

        // LinkedHashMap
        //1. Maintain insertion order
        //2. Duplicate values are allowed but not the keys
        //3. Only 1 null key and multiple null values are allowed.
        //4. Duplicate keys are not allowed — last value will overwrite previous one.

        // TreeMap
        //1. Maintains natural sorting order (ascending by key)
        //2. Duplicate values are allowed but not the keys
        //3. can contain multiple null value but doesn't allow the null key (throws NullPointerException)
        //4. Duplicate keys are not allowed — last value will overwrite previous one.




        Map m1 = new HashMap();
        m1.put("name", "Nikhita");
        m1.put("rollno", 827);
        m1.put("phone", 9900889877L);
        m1.put("phone", 9900889878L);
        m1.put("phone1", 9900889878L);
        m1.put("String", null);
        m1.put(null, null);
        m1.put(null, 2);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.containsKey("phone"));
        System.out.println(m1.containsValue(827));
        m1.clear();
        System.out.println(m1);

        System.out.println("-------------------------------");
        Map m2 = new LinkedHashMap();
        m2.put("name", "Nikhita");
        m2.put("rollno", 827);
        m2.put("phone", 9900889877L);
        m2.put("phone", 9900889878L);
        m2.put("phone1", 9900889878L);
        m2.put("String", null);
        m2.put(null, null);
        m2.put(null, 2);
        System.out.println(m2);
        System.out.println(m2.size());
        System.out.println(m2.containsKey("phone"));
        System.out.println(m2.containsValue(827));
        m2.clear();
        System.out.println(m2);

        System.out.println("---------------------------");
        Map m3 = new TreeMap();
        m3.put("name", "Nikhita");
        m3.put("rollno", 827);
        m3.put("phone", 9900889877L);
        m3.put("phone", 9900889878L);
        m3.put("phone1", 9900889878L);
        m3.put("String", null);
//      m3.put(null, null); NullPointerException
//      m3.put(null, 2); NullPointerException
        System.out.println(m3);
        System.out.println(m3.size());
        System.out.println(m3.containsKey("phone"));
        System.out.println(m3.containsValue(827));
        m3.clear();
        System.out.println(m3);
    }
}
