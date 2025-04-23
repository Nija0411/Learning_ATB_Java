package ex.lab020_exceptions;

import java.util.Scanner;

class AllInOne_TryCatch_Throws_Throw {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            validateage(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    static void validateage(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You are not a 18 so you can't go!!");
        }else{
            System.out.println("You can go!!");
        }
    }
}
