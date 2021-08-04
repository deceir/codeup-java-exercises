import java.util.Scanner;
import java.lang.Math;

public class DiceRoll {
    Scanner scanner = new Scanner(System.in);

    public static int diceProgram(int numberOfSides) {

        System.out.println("You roll the dice...");
        int dieOne = (int) (Math.random() * numberOfSides) + 1;
        int dieTwo = (int) (Math.random() * numberOfSides) + 1;
        System.out.println("The first die lands on " + dieOne + ".");
        System.out.println("The second die lands on " + dieTwo + ".");
        System.out.println("Totaling... " + (dieOne + dieTwo) + ".");
        return dieOne + dieTwo;

    }

    public static boolean continueProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to play again? (y/n)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y")) {
            return true;
        } else if (response.equalsIgnoreCase("n")) {
            return false;
        } else {
            return continueProgram();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Would you like to play a game? (y/n)");
        String userResponse = scanner.nextLine();
        do {

            if (userResponse.equalsIgnoreCase("y")) {
                System.out.println("Let's play a game of dice. Please enter the number of sides each die will have.");
                int userSides = scanner.nextInt();
                diceProgram(userSides);
                if (!continueProgram()) {
                    userResponse = "n";
                }
            }
        } while (userResponse.equalsIgnoreCase("y"));
    }
}
