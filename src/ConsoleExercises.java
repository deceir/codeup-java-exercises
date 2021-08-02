import java.util.Scanner;

public class ConsoleExercises {


    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately equal to %s.", pi);

        int userInteger = scanner.nextInt();

        System.out.println("The int you entered is " + userInteger);

        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.println(userInput1);
        System.out.println(userInput2);
        System.out.println(userInput3);

    }


}
