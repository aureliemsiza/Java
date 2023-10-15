import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = scanner.next().toLowerCase();

        String[] choices = { "rock", "paper", "scissors" };
        int randomIndex = (int) (Math.random() * choices.length);
        String computerChoice = choices[randomIndex];

        System.out.println("Computer chose: " + computerChoice);
        System.out.println("You chose: " + playerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else if (playerChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else if (playerChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid input. Please choose rock, paper, or scissors.");
        }

        scanner.close();
    }
}
