package task_and_interview.tasks;

import java.util.Scanner;

class ReversedRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print the Triangle: ");
        int num=input.nextInt();

        for(int i=num; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
