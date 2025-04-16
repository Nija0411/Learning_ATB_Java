package task_and_interview.intprep;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {

        //Generate a Random Number
        Random random = new Random();
        //random number will go from 1 to 100,
        // +1 indicates that we are including 100 too in a count if removed +1 it will
        // guess from 1 to 99
        int randomNumber = random.nextInt(100)+1;
        System.out.println("Your random number to guess is: " + randomNumber);

        //Guess a number
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number: ");

        int guess;
        int attempts =0;

        while(true){
            guess = input.nextInt();
            attempts++;

            if(guess>randomNumber){
                System.out.println("Guess is High");
            } else if (guess<randomNumber) {
                System.out.println("Guess is Low");
            }else {
                System.out.println("Your guess is correct at " +attempts+" attempts");
                break;
            }
        }

    }
}
