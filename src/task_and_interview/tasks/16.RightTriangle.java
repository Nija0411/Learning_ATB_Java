package task_and_interview.tasks;

import java.util.Scanner;

class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row no. you want to print: ");
        int num = input.nextInt();
        /*
             *
           * *
         * * *
       * * * *
     * * * * *
                 */
        for(int i=1; i<=num; i++){
            for(int k=i; k<num; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


