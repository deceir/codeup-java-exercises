import java.util.Scanner;
import java.lang.Math;

public class MethodsExercise {

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    //Multiplication without using asterisk
    public static double multiplicationHard(double num1, double num2) {
        double result = 0;
        for (int index = 0; index < num2; index++) {
            result += num1;
        }
        return result;
    }

    public static boolean getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number that is higher than " + min + " and lower than " + max + ".");
        int userInteger = scanner.nextInt();
        if (userInteger >= min && userInteger <= max) {
            System.out.println("The integer, " + userInteger + ", is within the given range.");
            return true;
        } else {
            System.out.println("The given integer, " + userInteger + ", is not within the given range.");
            return false;
        }
    }

    public static boolean optionsPresent() {
        System.out.println("Please select from the below options which method to access.");
        System.out.println("Options are: addition, subtraction, multiplication, division, modulus, getinteger, and factorial.");
        return true;
    }

    public static boolean continueProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to continue? (y/n)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y")) {
            return true;
        } else if (response.equalsIgnoreCase("n")) {
            return false;
        } else {
            return continueProgram();
        }
    }

    //Factorial Exercise
    public static int factorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i++) {
            if (i <= num) {
                output = output * i;
            }
        }
        return output;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doMath = true;


        System.out.println("You will access an arithmetic method.");

        optionsPresent();

        do {
            String userResponse = scanner.nextLine();

            //Addition
            if (userResponse.equalsIgnoreCase("addition")) {
                System.out.println("Enter the first number.");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number.");
                double num2 = scanner.nextDouble();
                System.out.println(addition(num1, num2));
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Subtraction
            if (userResponse.equalsIgnoreCase("subtraction")) {
                System.out.println("Enter the first number.");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number.");
                double num2 = scanner.nextDouble();
                System.out.println(subtraction(num1, num2));
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Multiplication
            if (userResponse.equalsIgnoreCase("multiplication")) {
                System.out.println("Enter the first number.");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number.");
                double num2 = scanner.nextDouble();
                System.out.println(multiplication(num1, num2));
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Division
            if (userResponse.equalsIgnoreCase("division")) {
                System.out.println("Enter the first number.");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number.");
                double num2 = scanner.nextDouble();
                System.out.println(division(num1, num2));
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Modulus
            if (userResponse.equalsIgnoreCase("modulus")) {
                System.out.println("Enter the first number.");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number.");
                double num2 = scanner.nextDouble();
                System.out.println(modulus(num1, num2));
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Multiplication Hard
            if (userResponse.equalsIgnoreCase("multiplicationhard")) {
                System.out.println("Enter the first number.");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number.");
                double num2 = scanner.nextDouble();
                System.out.println(multiplicationHard(num1, num2));
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Check Integer
            if (userResponse.equalsIgnoreCase("getinteger")) {
                System.out.println("Enter the first number.");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number.");
                int num2 = scanner.nextInt();
                getInteger(num1, num2);
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }
            //Factorial main
            if (userResponse.equalsIgnoreCase("factorial")) {
                System.out.println("Please enter a number that is between 1 and 10.");
                int userInput = scanner.nextInt();
                if (userInput >= 1 && userInput <= 10) {
                    for (int i = 1; i <= userInput; i++) {
                        if (i == 1) {
                            System.out.print(userInput + "! = ");
                        }
                        if (i < userInput) {
                            System.out.print(i + " x ");
                        } else {
                            System.out.print(i + " = " + factorial(userInput));
                        }
                    }
                } else {
                    System.out.println("The number entered was invalid.");
                }
                System.out.println("");
                doMath = continueProgram();
                if (doMath) {
                    optionsPresent();
                }
            }


        } while (doMath);
    }
}
