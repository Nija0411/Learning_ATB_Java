package ex.lab022_collection_framework.c04_queue;

import java.util.PriorityQueue;

class PriorityQueueExample {
    public static void main(String[] args) {

        //1. Allows no null
        //2. Duplicates are allowed
        //3. Maintains natural sorting order
        //4. remove() - removes the first/head element



        PriorityQueue p1 = new PriorityQueue<>();

        p1.add("Nikhita");
        p1.offer("Jalapure");
        p1.add("Rahul");
        p1.add("Rahul");
        System.out.println(p1); //[Jalapure, Nikhita, Rahul, Rahul]

//        p1.add(null); //NullPointerException

        p1.remove();
        System.out.println(p1); //[Nikhita, Rahul, Rahul]

        p1.clear();
        System.out.println(p1);
    }
}
