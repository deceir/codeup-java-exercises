package shapes;

import util.Input;

public class CircleApp {


    public static void main(String[] args) {

        int counter = 0;
        Input input = new Input();
        boolean wantsToContinue;
        do {


            System.out.println("Please enter the radius of the circle.");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            System.out.println("Circle radius is: " + radius);
            circle.setCircumference((2 * Math.PI * radius));
            System.out.println("Circle circumference is: " + circle.getCircumference());
            circle.setArea((Math.PI * (radius * radius)));
            System.out.println("Circle area is: " + circle.getArea());
            counter++;

            System.out.println("Would you like to make another circle? (y/n)");
            wantsToContinue = input.yesNo();


        } while (wantsToContinue);
        System.out.println("Number of circles created: " + Circle.numberOfCircles);

    }
}
