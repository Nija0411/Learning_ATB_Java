package task_and_interview.intprep;

import java.util.Random;
import java.util.Scanner;

class GuessNumberWithLimit {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to guess: ");
        int guess;
        int attempts = 0;
        final int maxAttempts = 5;

        while (attempts < maxAttempts) {
            guess = input.nextInt();
            attempts++;

            if (guess > randomNum) {
                System.out.println("Guess is High: ");
            } else if (guess < randomNum) {
                System.out.println("Guess is Low: ");
            } else {
                System.out.println("Your guess is Correct in " + attempts + " attempts");
                break;
            }
        }
        if (attempts == maxAttempts)
            System.out.println("You have reached the maximum attempts & your number is: " + randomNum);
    }
}
