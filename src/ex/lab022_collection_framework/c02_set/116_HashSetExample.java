package ex.lab022_collection_framework.c02_set;

import java.util.HashSet;
import java.util.Iterator;

class HashSetExample {
    public static void main(String[] args) {

        HashSet hs = new HashSet<>();

        //1. No insertion order is maintained — elements are stored based on hash codes, so the output may appear random.
        //2. Does not allow duplicates — any attempt to add a duplicate element will be ignored.
        //3. Allows only one null value — multiple nulls are not allowed.
        //4. Does not support accessing single elements — as it does not maintain any order or indexing.
        //5. Useful when the order doesn't matter


        hs.add("Apple");
        hs.add("Orange");
        hs.add(null);
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs); //[null, Apple, Watermelon, Orange]
        System.out.println(hs.size());
        System.out.println(hs.contains("Apple"));
        System.out.println(hs.remove("Orange"));
        System.out.println(hs);

        //Elements access
        System.out.println("-------------------Using for each loop");
        for (Object o : hs) {
            System.out.println(o);
        }

        System.out.println("------------------------Using Iterator");
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hs.clear();
        System.out.println(hs);

    }
}
