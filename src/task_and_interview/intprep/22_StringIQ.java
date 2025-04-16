package task_and_interview.intprep;

class StringIQ {
    //What is the o/p of the below code?
    public static void main(String[] args) {
        String s = "Hello";
        s = s.toUpperCase();
        System.out.println(s); //HELLO

        String s1 = "Hello";
        s.toUpperCase();
        System.out.println(s); //HELLO

        String s2 = "World";
        s2.toUpperCase();
        System.out.println(s2);//World
    }
}
