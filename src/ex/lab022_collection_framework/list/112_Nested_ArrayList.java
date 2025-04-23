package ex.lab022_collection_framework.list;

import java.util.ArrayList;

class Nested_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Papaya");
        System.out.println(fruits);

        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("Sapota");
        fruits1.add("Grapes");
        fruits1.add("Watermelon");
        System.out.println(fruits1);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(num);

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(fruits);
        arrayList.add(fruits1);
        arrayList.add(num);

        System.out.println(arrayList);
        System.out.println(arrayList.get(1));

    }

}
