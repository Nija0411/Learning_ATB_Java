package ex_lab.lab005_strings;

class StringImmutable2 {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("world");
        System.out.println(s1);
    }
}
//totally 3 objects will be created inside a pool--> hello, world, helloworld
//DoubtCode
