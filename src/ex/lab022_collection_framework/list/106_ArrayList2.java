package ex.lab022_collection_framework.list;

import java.util.ArrayList;
import java.util.List;

class ArrayList2 {
    public static void main(String[] args) {

        List l1 = new ArrayList();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("3");
        l1.add("4");
        l1.add(true);
        l1.add("3");

        System.out.println(l1.size()); //7
        System.out.println(l1.isEmpty()); //false
        System.out.println(l1.contains("1")); //true
        System.out.println(l1.contains(1)); //false
        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(l1.indexOf("3")); //2
        // Returns the index of the last occurrence of the specified element in this list,
        System.out.println(l1.lastIndexOf("3")); //6

        System.out.println(l1);

        System.out.println();

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }

        System.out.println();
        l1.clear(); //clears the whole list
        System.out.println(l1);
    }
}
