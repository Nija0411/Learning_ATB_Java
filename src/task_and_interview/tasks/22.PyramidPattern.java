package task_and_interview.tasks;

import java.util.Scanner;

class PyramidPattern {
    public static void main(String[] args) {
/*
           *   ----i=0, star=1, space=4  n=5 space =(n-i)
          *  *     i=1  star=2, space=3
         *  *  *    i=2  star=3, space =2
        *  *  *  *  i=3   star=4, space=1
       *  *  *  *  * i=4  star =5, space=0
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (n): ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}