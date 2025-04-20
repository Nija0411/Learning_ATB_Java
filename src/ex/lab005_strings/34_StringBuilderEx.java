package ex.lab005_strings;

class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Meo");
        System.out.println(sb.append(" Cat"));
        System.out.println(sb.reverse());

        StringBuffer sb1 = new StringBuffer("Java");
        System.out.println(sb1.append(" Programming"));
        System.out.println(sb1.delete(5, 16));
        System.out.println(sb1.replace(0,4,"C++"));
    }
}
