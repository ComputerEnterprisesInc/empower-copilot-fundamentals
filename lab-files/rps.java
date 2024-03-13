import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Please enter rock, paper, scissors, lizard or spock: ");
        String userChoiceString = userChoice.nextLine();
        System.out.println("You chose: " + userChoiceString);

        int computerChoice = (int) (Math.random() * 5);
        String computerChoiceString = "";
        if (computerChoice == 0) {
            computerChoiceString = "rock";
        } else if (computerChoice == 1) {
            computerChoiceString = "paper";
        } else if (computerChoice == 2) {
            computerChoiceString = "scissors";
        } else {
            computerChoiceString = "spock";
        }

        System.out.println("The computer chose: " + computerChoiceString);

        if (userChoiceString.equals(computerChoiceString)) {
            System.out.println("It's a tie!");
        } else if (userChoiceString.equals("rock")) {
            if (computerChoiceString.equals("paper") || computerChoiceString.equals("spock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoiceString.equals("paper")) {
            if (computerChoiceString.equals("scissors") || computerChoiceString.equals("lizard")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoiceString.equals("scissors")) {
            if (computerChoiceString.equals("rock") || computerChoiceString.equals("spock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoiceString.equals("lizard")) {
            if (computerChoiceString.equals("rock") || computerChoiceString.equals("scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoiceString.equals("spock")) {
            if (computerChoiceString.equals("paper") || computerChoiceString.equals("lizard")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        System.out.println("Do you want to play again? (y/n)");
        String playAgain = userChoice.nextLine();
        if (playAgain.equals("y")) {
            main(null);
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}