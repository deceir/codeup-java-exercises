import java.util.Scanner;

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
        return num1 / num2;
    }

    public static boolean continueProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to continue?");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return true;
        } else if (response.equalsIgnoreCase("no")) {
            return false;
        } else {
            return continueProgram();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doMath = true;

        System.out.println("You will access an arithmetic method.");
        System.out.println("Please select from the below options which method to access.");
        System.out.println("Options are: addition, subtraction, multiplication, and division.");
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
                    System.out.println("Please select from the below options which method to access.");
                    System.out.println("Options are: addition, subtraction, multiplication, and division.");
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
                    System.out.println("Please select from the below options which method to access.");
                    System.out.println("Options are: addition, subtraction, multiplication, and division.");
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
                    System.out.println("Please select from the below options which method to access.");
                    System.out.println("Options are: addition, subtraction, multiplication, and division.");
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
                    System.out.println("Please select from the below options which method to access.");
                    System.out.println("Options are: addition, subtraction, multiplication, and division.");
                }
            }


        } while (doMath);
    }
}
