package ex.lab022_collection_framework.c01_list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class VectorEx1 {
    public static void main(String[] args) {

        Vector v = new Vector();
        Vector v1 = new Vector(5); //Allowed

        v.add("Nikhita");
        v.add("Rahul");
        v.add("Jalapure");

        System.out.println(v);
        v.remove("Rahul");
        System.out.println(v);
        System.out.println(v.size());

        //Priniting Elements
        System.out.println("-------------Using Normal For Loop");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("---------------Using For Each");
        for (Object o : v) {
            System.out.println(o);
        }

        System.out.println("---------------Iterator"); //Supports List, Set, Queue
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------Enumeration"); //Supports Legacy class (Vector & Hashtable)
        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("------------------ListIterator"); //Supports only List
        ListIterator listI = v.listIterator();
        while (listI.hasNext()) {
            System.out.println(listI.next());
        }
    }
}
