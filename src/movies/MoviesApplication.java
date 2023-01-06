package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    private static Movie [] movies;
    public static void main(String[] args) {
        MoviesApplication.runMovieApplication();
        movies = MoviesArray.findAll();
        System.out.println(movies);
    }

    public static void runMovieApplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How would you like to view your movie options?:\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "Enter a number: "
        );
        int userInput = scanner.nextInt();

    }
}
