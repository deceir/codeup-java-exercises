package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("Enter a string.");
        input.getString();

        System.out.println("Enter an integer.");
        input.getInt();

        System.out.println("Enter a decimal.");
        input.getDouble();


        System.out.println("Integer range.");
        System.out.println("Enter the minimum range.");
        int num1 = input.getInt();
        System.out.println("Enter the maximum range.");
        int num2 = input.getInt();

        input.getInt(num1, num2);

        System.out.println("Double range.");
        System.out.println("Enter the minimum range.");
        double dnum1 = input.getDouble();
        System.out.println("Enter the maximum range.");
        double dnum2 = input.getDouble();

        input.getDouble(dnum1, dnum2);

    }

}
