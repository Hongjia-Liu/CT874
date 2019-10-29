/**
 * MovieTester.java - CT874 Assignment 5 Question 2 - b
 * @author Hongjia Liu 19234417
 */
import java.util.Scanner;

public class MovieTester {
    public static void main(String[] args) {
        Movie movieArray[] = new Movie[3];

        // A for loop to set the title, genre and rating of the Movie objects.
        Scanner input =  new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // Create three instances of the Movie class
            Movie newMovie = new Movie();
            System.out.print("Please enter the title of movie "
                    + (i + 1) + ":");
            newMovie.setTitle(input.nextLine());
            System.out.print("Please enter the genre of movie "
                    + (i + 1) + ":");
            newMovie.setGenre(input.nextLine());
            System.out.print("Please enter the rating (1-5) for movie "
                    + (i + 1) + ":");
            newMovie.setRating(input.nextInt());
            input.nextLine();
            // Store three instances in an array -- movieArray[].
            movieArray[i] = newMovie;
        }
        input.close();
        /**
         * A for loop to traverse the array and display the
         * title, genre and rating for each element of the array
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Movie " + (i + 1) + "  Title: "
                    + movieArray[i].getTitle());
            System.out.println("Movie " + (i + 1) + "  Genre: "
                    + movieArray[i].getGenre());
            System.out.println("Movie " + (i + 1) + " Rating: "
                    + movieArray[i].getRating());
            // Call the playIt() method for each object.
            movieArray[i].playIt();
        }

    }
}
