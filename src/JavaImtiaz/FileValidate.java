package JavaImtiaz;

import java.util.Scanner;

public class FileValidate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number 1 through 40");

        int  n = s.nextInt();


        while (n < 1 || n > 40){


            System.out.println("Please enter a number within range");
            n = s.nextInt();


        }
    }
}
