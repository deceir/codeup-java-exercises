package pop_quiz;

public class PopQuiz {

    public static double multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {

        System.out.println(multiply(7,2));

        System.out.println(multiply(7.0, 2.0));

        Duck duck = new Duck("Bob", 12);

        System.out.println(duck.getName());

        Mallard mallard = new Mallard("Rob", 10);

        mallard.quack();

        mallard.getDetails();

    }

}
