package task_and_interview.tasks;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an year to check Leap year or not: ");
        int year = input.nextInt();

       if((year%4==0 && year%100!=0) || year%400==0){
           System.out.println("Leap Year");
       }else {
           System.out.println("Not a Leap Year");
       }
    }
}
