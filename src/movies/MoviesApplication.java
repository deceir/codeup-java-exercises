package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean wantsToContinue = true;

        do {

            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view all movies in animated category");
            System.out.println("3 - view all movies in drama category");
            System.out.println("4 - view all movies in comedy category");
            System.out.println("5 - view all movies in scifi category");

            int userResponse = sc.nextInt();

            if (userResponse == 0) {
                wantsToContinue = false;
            }

            if (userResponse == 1) {
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName() + " | " + movie.getCategory());
                }
            }

        } while (wantsToContinue);
    }
}
