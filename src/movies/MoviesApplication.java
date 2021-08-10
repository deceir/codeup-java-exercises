package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static String getMovieByCat(String category) {
        String result = "";
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                result += movie.getName() + " | " + movie.getCategory() + "\n";
            }
        }
        return result;
    }

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

            if (userResponse == 2) {
                System.out.println(getMovieByCat("animated"));
            }

            if (userResponse == 3) {
                System.out.println(getMovieByCat("drama"));
            }

            if (userResponse == 4) {
                System.out.println(getMovieByCat("comedy"));
            }

            if (userResponse == 5) {
                System.out.println(getMovieByCat("scifi"));
            }

        } while (wantsToContinue);
    }
}
