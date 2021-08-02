import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately equal to %s.", pi);
//
//        int userInteger = scanner.nextInt();
//
//        System.out.println("The int you entered is " + userInteger);

//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();

//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);

//        String userLine = scanner.nextLine();
//        System.out.println(userLine);

        System.out.println("We will need a length and a width to continue!");
        System.out.println("Give us a width: ");

        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Give us a length: ");

        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);


    }


}
