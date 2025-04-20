package ex.lab005_strings;

class StringImmutableEx {
    //What is the O/p --> hello, because name is yet pointing to the hello, and not the HELLO
    public static void main(String[] args) {
        String name = "hello";
        name.toUpperCase();
        System.out.println(name); //hello
        System.out.println(name.toUpperCase()); //HELLO
        name= name.toUpperCase();
        System.out.println(name); //HELLO
    }
}
