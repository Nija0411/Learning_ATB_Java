package ex.lab022_collection_framework.list;

import java.util.LinkedList;
import java.util.List;

class LinkedListEx2 {
    public static void main(String[] args) {

        List<String> animal = new LinkedList(); //Restricting to use only Strings Generic concept.

        animal.add("Dog");
        animal.add("Cat");
        animal.add("Rat");
        animal.addFirst("Lion"); //adds the element in the first
        animal.addLast("Tiger"); //adds the element in the last

        System.out.println(animal);
        System.out.println(animal.size());

        animal.addFirst("Elephant");
        System.out.println(animal);

        //Accessing Elements
        System.out.println(animal.getFirst());
        System.out.println(animal.getLast());
        System.out.println(animal.getClass()); //returns the class

        System.out.println(animal.get(2)); //need to mention index to access mid elements
    }
}
