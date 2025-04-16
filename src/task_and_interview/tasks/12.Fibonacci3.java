package task_and_interview.tasks;

import java.util.Scanner;

class Fibonacci3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print Fibonacci numbers less than it: ");
        int limit = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci numbers less than " + limit + ":");

        for (int i = 0; a < limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}



