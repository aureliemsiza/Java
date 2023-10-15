import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange);

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Please guess a number between " + minRange + " and " + maxRange + ".");
            } else if (userGuess < targetNumber) {
                System.out.println("Higher! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Lower! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
