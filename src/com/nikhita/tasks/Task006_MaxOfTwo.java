package com.nikhita.tasks;

public class Task006_MaxOfTwo {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        String result = (num1 > num2) ? "Number 1 is Maximum" :
                (num1 == num2) ? "Numbers ars Equal" : "Number 2 is Maximum";
        System.out.println(result);

    }
}
