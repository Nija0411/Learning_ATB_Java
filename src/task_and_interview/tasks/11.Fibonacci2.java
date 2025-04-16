package task_and_interview.tasks;

import java.util.Scanner;

class Fibonacci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int first =0, second =1;

        //This will print 100 numbers of series
        for(int i=0; i<num; i++){
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
