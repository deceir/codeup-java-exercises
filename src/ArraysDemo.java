import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
//        int[] anArray = new int[10];

        int numberOfElements = 10;
        int[] anArray = new int[numberOfElements];


        int[] scorecard = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        Arrays.fill(scorecard, 0);

        System.out.println("Score Card has been reset \n" + Arrays.toString(scorecard));

    }
}
