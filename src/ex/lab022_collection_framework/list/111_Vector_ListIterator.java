package ex.lab022_collection_framework.list;

import java.util.ListIterator;
import java.util.Vector;

class Vector_ListIterator {
    public static void main(String[] args) {

        Vector vector = new Vector<>();

        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("------------------Reverse");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
