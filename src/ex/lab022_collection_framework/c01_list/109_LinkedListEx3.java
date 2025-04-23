package ex.lab022_collection_framework.c01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LinkedListEx3 {
    public static void main(String[] args) {

        List myList1 = new ArrayList(5);
        List myList2 = new ArrayList();

//      List myList3 = new LinkedList(9); size initialization is not allowed in LL

        List myList4 = new LinkedList();

        myList4.add("Pramod");
        myList4.add("Dutta");
        myList4.add("Amit");
        myList4.add("meenu");
        myList4.add("ritwik");
        myList4.add("ritwik");
        myList4.add(null);
        myList4.add(true);
        myList4.add(123);
        System.out.println(myList4);

        System.out.println(myList4.isEmpty());
        System.out.println(myList4.size());
        System.out.println(myList4.contains("Dutta"));
        System.out.println(myList4.indexOf("Dutta"));
        System.out.println(myList4.indexOf("ritwik"));
        System.out.println(myList4.lastIndexOf("ritwik"));

        //print the elements of LinkedList
        System.out.println("---------------------------");
        for(int i=0; i<myList4.size(); i++){
            System.out.println(myList4.get(i));
        }
    }
}
