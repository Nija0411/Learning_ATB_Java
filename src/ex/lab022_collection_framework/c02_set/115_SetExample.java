package ex.lab022_collection_framework.c02_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetExample {
    public static void main(String[] args) {
        Set s1 = new HashSet(5);

        Set s2 = new LinkedHashSet(5);

//     Set s3 = new TreeSet(5); Initialization is not allowed

        Set s3 = new TreeSet();

        s1.add("Nikhita");
        s1.add("Nikhita"); //removes duplocates or dup not allowed
        s1.add(null);
        s1.add(123);
        System.out.println(s1); // [null, Nikhita, 123]
    }
}
