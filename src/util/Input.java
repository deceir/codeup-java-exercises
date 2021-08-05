package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public String getString() {
        String input = scanner.nextLine();
        return input;
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Please enter an int between " + min + " and " + max + ".");
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            return input;
        } else {
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a decimal between " + min + " and " + max + ".");
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            return input;
        } else {
            return getDouble(min, max);
        }
    }





    public static void main(String[] args) {

    }
}
