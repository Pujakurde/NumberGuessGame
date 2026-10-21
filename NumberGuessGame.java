import java.util.Random;
import java.util.Scanner;
public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Computer has selected a random number between 1 and 100.");

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("The number to guess is: " + numberToGuess); // For testing purposes, you can remove this line in production
        int numberOfTries = 0;

        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            // Here you would typically get user input, but for this example, we'll simulate guesses
            int userGuess = random.nextInt(100) + 1; // Simulated user guess
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Your guess of " + userGuess + " is too low.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess of " + userGuess + " is too high.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
            }
        }
    }
}