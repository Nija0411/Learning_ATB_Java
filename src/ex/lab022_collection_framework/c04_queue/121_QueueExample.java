package ex.lab022_collection_framework.c04_queue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {


        Queue pq = new PriorityQueue();

        pq.add("Nikhita");
        pq.add("Jalapure");

        HashSet hs = new HashSet();
        hs.add("Nikhita");
        hs.add("Jalapure");

        System.out.println(pq); //[Jalapure, Nikhita] //Natural sorting
        System.out.println(hs); //[Nikhita, Jalapure] //maintains no sorting order

    }
}
