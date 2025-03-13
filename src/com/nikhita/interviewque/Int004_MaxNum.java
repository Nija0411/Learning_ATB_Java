package com.nikhita.interviewque;

public class Int004_MaxNum {
    //Find a Max by using Ternary
    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        int c = -11;

        String result = (a > b && a > c) ? "A is max" :
                ((b > a && b > c) ? "B is Max" : "C is Max");
        System.out.println(result);

        //another way
        int max = (a > b) ? (a > c) ? a : c : ((b > c) ? b : c);
        System.out.println(max);
    }
}