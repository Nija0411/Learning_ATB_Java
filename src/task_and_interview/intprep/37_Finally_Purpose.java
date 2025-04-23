package task_and_interview.intprep;

import java.util.Scanner;

class Finally_Purpose {
    /*
    Purpose of a finally block:
    1. Closing files
    2. Releasing resources
    3. Closing DB connections */
    public static void main(String[] args) {
        Scanner input = null;
        input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = input.nextInt();

        try {
            int b = 100 / a;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
            System.out.println("End of a Program!!");
        }
    }
}
