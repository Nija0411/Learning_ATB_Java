package com.nikhita.tasks;

public class Task004_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); //34
        System.out.println(a); //13
    }
}
