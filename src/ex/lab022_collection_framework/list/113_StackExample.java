package ex.lab022_collection_framework.list;

import java.util.Stack;

class StackExample {
    public static void main(String[] args) {

        Stack stack = new Stack();
//        stack.add("Meo");
//        stack.add("Cat");
//        System.out.println(stack); //this is also valid

        stack.push("Iphone");
        stack.push("Realme");
        stack.push("MI");
        stack.add("Samsung");
        System.out.println(stack);
        System.out.println(stack.peek());//return the last element but doesn't remove it
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.add("Neha")); //true
        System.out.println(stack);
        stack.add("Chetan");
        stack.add("Chetan");
        stack.push("Vijay");
        System.out.println(stack);
    }
}
