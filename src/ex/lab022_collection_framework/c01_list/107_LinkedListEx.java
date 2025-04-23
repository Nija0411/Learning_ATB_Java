package ex.lab022_collection_framework.c01_list;

import java.util.LinkedList;
import java.util.List;

class LinkedListEx {
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        list.clear();
        System.out.println(list);

    }
}
