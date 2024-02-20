package com.example.movieproject;
import java.util.Scanner;
// Import statement for Scanner class

public class MovieDriver_Task1 {

	 public static void main(String[] args) {

	        // Create a new object of type Scanner that reads from the keyboard
	        Scanner keyboard = new Scanner(System.in);

	        // Variables to store movie details
	        String title, rating;
	        int soldTickets;

	        // Prompt the user to enter the title of a movie
	        System.out.println("Enter the title of a movie.");
	        title = keyboard.nextLine();

	        // Prompt the user to enter the movie's rating
	        System.out.println("Enter the rating of the movie.");
	        rating = keyboard.nextLine();

	        // Prompt the user to enter the number of tickets sold at a theater
	        System.out.println("Please enter the number of tickets sold at a theater.");
	        soldTickets = keyboard.nextInt(); // Directly read the integer without checking

	        // Goodbye message before closing the scanner
	        System.out.println("Goodbye.");

	        keyboard.close(); // Close the scanner to prevent resource leaks
	    }

	}