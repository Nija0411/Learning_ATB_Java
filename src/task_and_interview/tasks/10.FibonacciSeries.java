package task_and_interview.tasks;

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to find out the Fibonacci Series: ");
        int num = input.nextInt();

        int first =0, second=1;
        //This will print less than 100
        for(; first<num; ){
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
        }

    }
}
