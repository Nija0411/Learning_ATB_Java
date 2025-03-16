package com.nikhita.tasks;

import java.util.Scanner;

public class Task008_EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check Even or Odd: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }
    }
}
