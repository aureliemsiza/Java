import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "banana", "chocolate", "dolphin", "elephant"};
        String wordToGuess = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[wordToGuess.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6; // Number of attempts allowed

        System.out.println("Welcome to Hangman!");
        
        while (attempts > 0) {
            System.out.print("Word to guess: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }
            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean isCorrectGuess = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    isCorrectGuess = true;
                }
            }

            if (!isCorrectGuess) {
                attempts--;
            }

            boolean wordGuessed = true;
            for (char c : guessedWord) {
                if (c == '_') {
                    wordGuessed = false;
                    break;
                }
            }

            if (wordGuessed) {
                System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
                break;
            }
        }

        if (attempts == 0) {
            System.out.println("You've run out of attempts. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}

