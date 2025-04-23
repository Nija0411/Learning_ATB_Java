package ex.lab022_collection_framework.c04_queue;

import java.util.Deque;
import java.util.ArrayDeque;

class ArrayDequeExample {
    public static void main(String[] args) {

        Deque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        System.out.println(deck);
    }
}
