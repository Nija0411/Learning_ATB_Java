package task_and_interview.tasks;

import java.util.Scanner;

class CountVowelConsonants {
    public static void main(String[] args) {
        String string = "Write a Java Program to find Out the total number of Vowels and Consontants";
        string = string.replaceAll(" ", "");
        string = string.toLowerCase();

        int vowels = 0, consonants = 0;
        for (int i = 0; i <= string.length() - 1; i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

