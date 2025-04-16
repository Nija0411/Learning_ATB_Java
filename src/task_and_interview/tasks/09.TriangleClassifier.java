package task_and_interview.tasks;

import java.util.Scanner;

class Task009_TriangleClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lengths of the Triangle: ");
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();

        //Edge Cases
        if (t1 == 0 || t2 == 0 || t3 == 0) {
            System.out.println("Not a Triangle");
            System.exit(0);
        }
        if (t1 + t2 <= t3 || t2 + t3 <= t1 || t1 + t3 <= t1) {
            System.out.println("Not a Triangle");
            System.exit(0);
        }

        //Real Logic
        if (t1 == t2 && t2 == t3) {
            System.out.println("Triangle is Equilateral");
        } else if (t1 == t2 || t1 == t3 || t2 == t3) {
            System.out.println("Triangle is Isosceles");
        } else {
            System.out.println("Triangle is Scalene");
        }
    }
}
