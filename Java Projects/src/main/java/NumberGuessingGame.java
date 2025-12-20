import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 7;
        System.out.println("🎲 Guess the Number (1 to 100)");
        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            try {
                int guess = Integer.parseInt(scanner.nextLine());
                attempts++;
                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed it.");
                    break;
                } else if (guess < number) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("😢 Out of attempts! The number was " + number + ".");
        }
        scanner.close();

    }

}

