package duke;

import java.util.Scanner;

public class RApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int answer = 3;
        int answerTwo = 2;
        System.out.println("""
                Which programming language is being used for this message?
                Choose one of the following...
                1. Python
                2. JavaScript
                3. Java
                4. Swift
                """);
        int userChoice = (int) userInput.nextInt();
        while (userChoice != answer){
            System.out.println("Incorrect, please try again");
            System.out.println("""
                Which programming language is being used for this message?
                Choose one of the following...
                1. Python
                2. JavaScript
                3. Java
                4. Swift
                """);
            userChoice = (int) userInput.nextInt();

        }
        System.out.println("""
                Which programming language is used on the web?
                Choose one of the following...
                1. Python
                2. JavaScript
                3. Java
                4. Swift
                """);
        int userChoiceTwo = (int) userInput.nextInt();
        while (userChoiceTwo != answerTwo){
            System.out.println("""
                Which programming language is used on the web?
                Choose one of the following...
                1. Python
                2. JavaScript
                3. Java
                4. Swift
                """);
            userChoiceTwo = (int) userInput.nextInt();

        }


    }
}
