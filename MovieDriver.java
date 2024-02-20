package com.example.movieproject;
import java.util.Scanner;
// Import statement for Scanner class

public class MovieDriver {

    public static void main(String[] args) {

        // Create a new object of type Scanner that reads from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Variables to store movie details
        String title, rating;
        int soldTickets;

        // Loop control variable
        char answer;

        do {
            // Prompt the user to enter the title of a movie
            System.out.println("Enter the title of a movie.");
            title = keyboard.nextLine();

            // Prompt the user to enter the movie's rating
            System.out.println("Enter the rating of the movie.");
            rating = keyboard.nextLine();

            // Prompt the user to enter the number of tickets sold at a theater
            System.out.println("Please enter the number of tickets sold at a theater.");
            soldTickets = keyboard.nextInt();

            // Creating a new movie object with the input details
            Movie bMovie = new Movie(title, rating, soldTickets);
            
            // Print out the information using the movie's toString method
            System.out.println(bMovie);

            // Clear the newline character left in the buffer
            keyboard.nextLine();

            // Prompt the user to enter whether they wish to continue
            System.out.println("Do you want to enter another? (y or n)");
            answer = keyboard.nextLine().charAt(0);

        } while (answer == 'y' || answer == 'Y');

        System.out.println("Goodbye.");

        keyboard.close();
    }

}
