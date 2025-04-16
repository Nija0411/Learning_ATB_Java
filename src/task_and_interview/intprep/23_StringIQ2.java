package task_and_interview.intprep;

class StringIQ2 {
    //How many objects will be created in a pool?
    // 1 object Hello, bcz pool reuses the obj instead of creating a new obj.
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";

        System.out.println(s1==s2 && s2==s3); //true, same objects
        System.out.println(s1.equals(s2) && s2.equals(s3)); //true, same content

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hello");

        System.out.println(s1==s4); //false

        System.out.println(s4==s5 && s5==s6); //false
        System.out.println(s4.equals(s5) && s5.equals(s6) && s6.equals(s1)); //true

    }
}
