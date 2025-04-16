package task_and_interview.intprep;

import java.util.Scanner;

class FactorialUsing_WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate the Factorial: ");
        int num = input.nextInt();

        int fact = 1;
        if(num<=1) System.out.println(1);

        int i=2;
        while(i<=num){
            fact *=i;
            i++;
        }
        System.out.println("Factorial of " + num + " = " +fact);
    }
}
