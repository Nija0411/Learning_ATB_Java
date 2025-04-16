package ex_lab.lab005_strings;

class StringFunctions2 {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
//      System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat(" Patel"));

        // 3. contains()
        System.out.println(name.contains("om"));//Checks whether the om contains or no

        // 4. equals()
        System.out.println(name.equals("Sonal")); //content compare

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));//Ignore cases

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o')); //will return index num

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m")); //will give the indexof 1st m

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N')); //replaces n to N

        // 9. split()

        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@"); //splits string from @ 3 strings tot
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3)); //returns a substring

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Sonal"));


        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Pramod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);

//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);


        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));

    }
}

