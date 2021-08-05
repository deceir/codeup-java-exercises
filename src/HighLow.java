import java.lang.Math;
import java.util.Scanner;

public class HighLow {

    public static int randomNumber() {
        return (int)(Math.random() * 99) + 1;
    }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("I will pick a number between 1 and 100, try to guess the number.");
        int numberOfGuesses = 0;
        int correctNumber = randomNumber();
        int userGuess = 0;
        do {
            System.out.println("Enter your guess.");
            userGuess = scanner.nextInt();
            if (userGuess >= 1 && userGuess <= 100) {
                if (userGuess < correctNumber) {
                    System.out.println("HIGHER!");
                    numberOfGuesses++;
                    System.out.println("Attempts: " + numberOfGuesses);

                }
                if (userGuess > correctNumber) {
                    System.out.println("LOWER!");
                    numberOfGuesses++;
                    System.out.println("Attempts: " + numberOfGuesses);

                }
            }

        } while (userGuess != correctNumber);
        System.out.println("GOOD GUESS!");
    }

}
