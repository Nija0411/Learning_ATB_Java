package com.nikhita.javabasics;

public class Lab008_PostInc {
    public static void main(String[] args) {
        //Example for Post Increment
        int a =10;
        int b = a++;
        System.out.println(a); //11
        System.out.println(b); //10

        int a1 = 10;
        a1++;   //11
        int b1 = a1 + a1++; //11+12
        System.out.println(a1); //12
        System.out.println(b1); //22
    }
}
