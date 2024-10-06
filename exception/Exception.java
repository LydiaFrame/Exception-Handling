/*
 * Program: Exception.java
 * Student: Lydia Frame 
 * Purpose: Use your imagination and create an application that demonstrates the use 
 * of try/catch bloc and Finally Clause in a Java program.
*/

import java.util.Scanner;
import java.util.InputMismatchException; 

public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lucky = 7;  
        int guess = 0;  

        
        try {
        // Continue looping until the user guesses correctly
        while (guess != lucky) {
            try {
                System.out.print("Guess my lucky number: ");
                guess = input.nextInt(); // User input for guessing the number

                // Check if the guess matches the lucky number
                if (guess == lucky) {
                    System.out.println("Congratulations, you got it right! Lucky number 7!");
                } else {
                    System.out.println("Sorry, wrong number :( ... Try again!");
                    System.out.println(" ");
                }
            } catch (InputMismatchException e) {
                // Handle invalid input if the user doesn't enter an integer
                System.out.println("Invalid input! Please enter a valid integer.");
                input.next(); 
            }
        }

    }

        // Finally block 
        finally {
            input.close(); 
            System.out.println("Thank you for playing!"); 
        }
    }
}