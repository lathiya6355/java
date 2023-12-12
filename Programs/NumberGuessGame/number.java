import java.util.Scanner;
import java.util.Random;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxRange = 100; // Maximum number for the guessing range
        int randomNumber = random.nextInt(maxRange) + 1; // Generate a random number between 1 and maxRange
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and " + maxRange + ". Try to guess it!");

        while (!hasGuessed) {
            System.out.print("Enter your guess (between 1 and " + maxRange + "): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > maxRange) {
                System.out.println("Please enter a number within the valid range!");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts!");
                hasGuessed = true;
            }
        }

        scanner.close();
    }
}

