import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {

        int guessCount = 0;
        int guess;
        boolean guessedNumber = false;
        Random randomNumber = new Random();
        int guessNumber = randomNumber.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);

        while (!guessedNumber) {
            System.out.println("Enter your integer guess");
            guess = input.nextInt();
            guessCount++;
            if (guess >= 1 && guess <= 100) {
                if (guess == guessNumber) {
                    guessedNumber = true;
                    System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses. Thanks for playing!");
                } else if (guess < guessNumber) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Your guess is too high");
                }
            } else System.out.println("That was a wasted guess! Pick a number between 1 and 100");

        }
    }
}
