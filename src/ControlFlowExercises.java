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


        for (int index = 0; index <= 100; index++) {
//            System.out.println(index);
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (index % 3 == 0) {
                System.out.println("Fizz");
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
        }

    }

}
