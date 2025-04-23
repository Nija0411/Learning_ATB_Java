package ex.lab022_collection_framework.c02_set;

import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashSetExample {
    public static void main(String[] args) {

        //1. Doesn't allow duplicates
        //2. Allows only 1 null, multiple null are not allowed
        //3. Maintains insertion order - the way you add, the same way they get stored
        //4. Useful when insertion order matters


        LinkedHashSet lhs = new LinkedHashSet<>();

        lhs.add("Apple");
        lhs.add("apple");
        lhs.add(null);
        lhs.add(null);
        lhs.add("Watermelon");
        lhs.add("Orange");
        lhs.add("Orange");
        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.getFirst());

        //Access elements
        System.out.println("-----------------Using for each");
        for(Object o: lhs){
            System.out.println(o);
        }

        System.out.println("-----------------Using Iterator");
        Iterator iterator = lhs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
