package ex.lab005_strings;

class StringBuilder_StringBuffer {
    //Totally 4 objects are created
    //1 in String Pool
    //3 are in Heap Area
    public static void main(String[] args) {
        //Creating a String
        String s0 = "Hello";
        String s1 = new String("Hello");
        StringBuilder s2 = new StringBuilder("Hello");
        StringBuffer s3 = new StringBuffer("Hello");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
