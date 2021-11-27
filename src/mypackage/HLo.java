package mypackage;

import java.util.Scanner;

public class HLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "";
        do {
            // Create a random number for the user to guess
            int number = (int)(Math.random() * 100 + 1);
            int userEntry = 0;
            while (userEntry != number)
            {
                System.out.println("Guess a number between 1 and 100:");
                userEntry = scanner.nextInt();
                if (userEntry < number) System.out.println(userEntry + " is too low. Try again.");
                else if (userEntry > number) System.out.println(userEntry + " is too high. Try again.");
                else System.out.println(userEntry + " is correct. You win!");
            } // End of while loop for guessing
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scanner.next();
        }while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing the guessing game. Good bye");
    }
}


