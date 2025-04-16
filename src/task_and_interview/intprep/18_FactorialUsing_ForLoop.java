package task_and_interview.intprep;

import java.util.Scanner;

class FactorialUsing_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate the Factorial: ");
        int num = input.nextInt();

        int factorial = 1;
        if(num<=0){
            System.out.println(1);
        }else {
            for(int i =1; i<=num; i++){
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " = " +factorial);
        }
    }
}
