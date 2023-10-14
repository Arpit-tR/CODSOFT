import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner tR = new Scanner(System.in);
        Random random = new Random();
        int lower = 1;
        int upper = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int targetNumber = random.nextInt(upper - lower + 1) + lower;
            int attempts = 0;

            System.out.println("Thinking of a number between " + lower + " and " + upper + ".");

            while (attempts < maxAttempts) {
                System.out.print("Your guess: ");
                int userGuess = tR.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts
                            + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was "
                        + targetNumber + ".");
            }

            System.out.print("Your current score is: " + score + ". Play again? (yes/no): ");
            String playAgain = tR.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        tR.close();
    }
}
