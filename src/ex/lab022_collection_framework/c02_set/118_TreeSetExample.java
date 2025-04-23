package ex.lab022_collection_framework.c02_set;

import java.util.Iterator;
import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {

        // 1. null values are not allowed — adding null will throw NullPointerException
        // 2. All elements must be mutually comparable — mixing types (e.g., String and Integer) throws ClassCastException
        // 3. Elements are stored in natural ascending order (alphabetical for Strings, numeric for numbers)
        // 4. TreeSet is useful when sorting and uniqueness are both required


        TreeSet treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Sapota");
        treeSet.add("Banana");
//      treeSet.add(null); NullPointerException
//      treeSet.add(123); java.lang.ClassCastException
        System.out.println(treeSet);

        System.out.println(treeSet.size());
        System.out.println(treeSet.contains("Sapota"));

        //Accessing elements
        System.out.println("--------------Using for each");
        for (Object o : treeSet) {
            System.out.println(o);
        }
        System.out.println("---------------Using Iterator");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        treeSet.clear();
        System.out.println(treeSet);

    }
}
