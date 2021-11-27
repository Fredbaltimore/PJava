package mypackage;
import java.util.Scanner;

public class HiLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "";
        int number = (int)(Math.random() * 100 +1);
        int userEntry = 0;

            do {
                System.out.println("Enter a number between 1 and 100");
                userEntry = scanner.nextInt();
                if (userEntry < number) System.out.println(userEntry + " is too low. TRY AGAIN!");
                else if (userEntry > number) System.out.println(userEntry + " is too high. TRY AGAIN!");
                else System.out.println(userEntry + " is the correct answer!");
            } while (userEntry != number);
        System.out.println("Want to play again? Answer y for yes and  n for no");
        playAgain = scanner.next();
        while(playAgain.equalsIgnoreCase("y"));


    }
}
