package JavaImtiaz;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int counter = 0;
        String time = "times";
        int random = (int) (Math.random() * 50);
        Scanner sc = new Scanner(System.in);
        System.out.println(random);
        System.out.println("Guess the number");
        System.out.println("Enter a number from 1 to 50");
        int userGuess = sc.nextInt();


        while(true){
            if(userGuess == random) {
                counter++;
                if (counter == 1){
                    time = "time";
                }
                System.out.println("You got it right It took you " +counter+
                        " "+time+ " to get it right");
                break;
            } else if(userGuess < random){
                counter++;
                System.out.println("Number is too low, try again");

            }else if(userGuess > random){
                counter++;
                System.out.println("Too high, please enter new guess, thats lower");

            }
            userGuess = sc.nextInt();
        }


    }

}
