package ex_lab.lab005_strings;

class StringFunctions {
    public static void main(String[] args) {
        String s1 = "A"; //Valid

        String s = "ABCD";
        System.out.println(s.length()); //4
        System.out.println(s.toLowerCase()); //abcd
        System.out.println(s.toUpperCase()); //ABCD
        System.out.println(s.concat("E")); //ABCDE
        System.out.println(s+"F"); //ABCDF
        System.out.println(s.length()); //4
        s = s.concat("EF");
        System.out.println(s.length()); //6
    }
}
