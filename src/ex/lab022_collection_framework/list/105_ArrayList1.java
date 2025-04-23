package ex.lab022_collection_framework.list;

import java.util.ArrayList;
import java.util.List;

class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("Nikhita");
        a1.add("Jalapure");
        a1.add(true);
        a1.add(1);
        a1.add(1); //duplicate is allowed
        a1.add(null);
        System.out.println(a1); //[Nikhita, Jalapure, true, 1, 1, null]
        System.out.println(a1.size()); //6

        List l1 = new ArrayList();
        l1.add("123");
        l1.add("456");
        System.out.println(l1); //[123,456]
        System.out.println(l1.isEmpty()); //false

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty()); //true
    }
}
