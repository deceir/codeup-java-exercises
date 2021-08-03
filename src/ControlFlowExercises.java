import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Would you like to continue?");
//        boolean userResponse = scanner.next().toLowerCase(Locale.ROOT).contains("y");
//
//        String userResponseString = "";
//
//        if (userResponse == true) {
//            userResponseString = "yes";
//        } else {
//            userResponseString = "no";
//        }
//
//        System.out.println("The response is: " + userResponseString);

//        int i = 5;
//        while (i <= 15) {
//
//            System.out.println(i);
//            i++;
//
//        }
//
//
//        int x = 100;
//        do {
//
//            x -= 5;
//            System.out.println(x);
//        } while (x > -10);

//        int y = 2;
//        do {
//            System.out.println(y);
//            y = y * y;
//        }while (y < 1000000);
//

        //FizzBuzz

//        for (int index = 0; index <= 100; index++) {
//            if (index % 3 == 0 && index % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (index % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (index % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(index);
//            }
//        }

//        //Table Loop
//        boolean userContinues = true;
//        do {
//
//            System.out.println("What number do you choose?");
//            int userInteger = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.print("number ");
//            System.out.print('|');
//            System.out.print(" squared ");
//            System.out.print('|');
//            System.out.print(" cubed");
//            System.out.printf("%n");
//            System.out.println("______ |  ______ | _____");
//
//            for (int loopIndex = 1; loopIndex <= userInteger; loopIndex++) {
//                System.out.printf("%-6d", loopIndex);
//                System.out.print(" | ");
//                System.out.printf("%-7d", (loopIndex * loopIndex));
//                System.out.print(" | ");
//                System.out.print(loopIndex * loopIndex * loopIndex);
//                System.out.println();
//            }
//            System.out.println("Would you like to continue? (y/n)");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        }while (userContinues == true);

//        String l = scanner.nextLine();

//        // Grades exercise
        System.out.println("Please enter your grade.");
        int userGrade = scanner.nextInt();

        if (userGrade < 101 && userGrade > 87) {
            System.out.println("Your grade is an A!");
        } else if (userGrade < 88 && userGrade > 79) {
            System.out.println("Your grade is a B!");
        } else if (userGrade < 80 && userGrade > 66) {
            System.out.println("Your grade is a C!");
        } else if (userGrade < 67 && userGrade > 59) {
            System.out.println("Your grade is a D!");
        } else {
            System.out.println("Your grade is an F!");
        }


    }

}
