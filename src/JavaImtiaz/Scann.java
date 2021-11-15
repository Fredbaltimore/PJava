package JavaImtiaz;

import java.util.ArrayList;
import java.util.Scanner;


public class Scann {

    /**
     *
     * @param args
     *  Format specifiers include flags, width, precision, and conversion characters in this sequence:
     *  Specifiers in brackets are optional
     * %[flags][width][.precision]conversion-character
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            numbers.add(i);
        }
        
        System.out.println(numbers);
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        //prints out multiples up to 10
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " x " + i + " = " + product);
        }

//        if(n >= 2) {
//            for (int i = 1; i <= 10; i++) {
//                int product = n * i;
//                System.out.println(n + " x " + i + " = " + product);
//            }
//        }else if (n == 1) {
//            System.out.println("1 x 1 = " + n);
//        }else if ( n == 0){
//            for (int i = 1; i <= 10; i++) {
//                int product = n * i;
//                System.out.println(n + " x " + i + " = " + product);
//            }
//        }else if (n < 0){
//            for (int i = 1; i <= 10; i++) {
//                int product = n * i;
//                System.out.println(n + " x " + i + " = " + product);
//            }
//
//        }

 }
}
