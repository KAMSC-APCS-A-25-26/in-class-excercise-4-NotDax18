import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; // 1-100 inclusive
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        int attempts = 0;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // discard invalid input
                System.out.print("Enter your guess: ");
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low! Try again.");
            } else if (guess > secret) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("You got it!");
                System.out.println("It took you " + attempts + " attempt" + (attempts == 1 ? "" : "s") + ".");
            }
        } while (guess != secret);
    }
}