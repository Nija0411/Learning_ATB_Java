package task_and_interview.tasks;

import java.util.Scanner;

class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to check Palindrome: ");
        String userString = input.next();

//        String newString = reversed(userString);
        String newString = reversed1(userString);

        if(newString.equalsIgnoreCase(userString)){
            System.out.println("String is a Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }
    }

    private static String reversed(String s1) {
        String reversedString = "";
        for(int i=s1.length()-1; i>=0; i--){
            reversedString += s1.charAt(i);
        }
        return reversedString;
    }
    //Using StringBuffer function
    static String reversed1(String s2){
        StringBuffer sb = new StringBuffer(s2);
        return sb.reverse().toString(); //return a string so that calling will be easy
    }
}
