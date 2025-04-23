package ex.lab022_collection_framework.c01_list;

import java.util.ArrayList;
import java.util.List;

class ListExample {
    public static void main(String[] args) {

//        List list = new List(); Object of List can't be created.

        List fruits = List.of("Apple", "Banana", "Mango", "Orange", "Watermelon");
        System.out.println(fruits);
        System.out.println(fruits.size());

//        fruits.add("Chiku"); // java.lang.UnsupportedOperationException
//        fruits.remove("Apple"); //java.lang.UnsupportedOperationException

        //We can't use add & remove methods directly in a List because these are abstract methods


        List l1 = new ArrayList();
        l1.add("hello");
        l1.add(123);
        l1.add(true);
        System.out.println(l1);

        l1.remove(1); //index number
        System.out.println(l1);
    }
}
