package JavaImtiaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

abstract class Book {
    // Protected Fields
    protected String title;
    protected String author;
    protected String price;

    // Parameterized Constructor
    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Abstract Method
    public abstract String bookDetails();

}

class ABook extends Book {

    // Parameterized Constructor
    public ABook(String title, String author, String price) {
        super(title, author, price);
    }

    public String bookDetails() {
        return "Book title: "+title+ "\nAuthors name: " +author+ "\nPrice: " +price;
    }

}

class Main{
    public static ArrayList<String> sortMe(ArrayList<String> list){
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
//        String upperCse  = letters.toUpperCase();
//        System.out.println(upperCse);
        int counter = 0;
        //            System.out.print("Index: "+counter++ + " ");
//            System.out.println("Letters: " + letters.charAt(i));



        ArrayList<String> randomNames = new ArrayList<>();
        randomNames.add("Fred");
        randomNames.add("John");
        randomNames.add("Larry");
        randomNames.add("Donald");
        System.out.println(sortMe(randomNames));

        String letters = "abcdefghijkl";
        ArrayList<String> forLetters = new ArrayList<>();

        for(int j = 0; j < letters.length() / 2; j++){
            System.out.print(letters.charAt(j)+" ");
        }
        System.out.println();
        for (int i = letters.length() - 1; i >= 0; i--){

            forLetters.add(String.valueOf(letters.charAt(i)));
        }
        System.out.println(letters);
        System.out.println(forLetters);

        Book someBook = new ABook("Going to LA","James Rhodes", "19.99");
        System.out.println(someBook.bookDetails());
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i < 50; i+=2){
            oddNumbers.add(i);


        }
        String newOne = Arrays.toString(new ArrayList[]{oddNumbers})
                .replaceAll("[\\[\\],]", "");
        System.out.println();
        System.out.println(newOne);
        oddNumbers.replaceAll(e -> e  * 2);
        ArrayList<Integer> newTwo = oddNumbers;
        String newThree = Arrays.toString(new ArrayList[]{newTwo})
                        .replaceAll("[\\[\\],]", "");
        System.out.println(newThree);
        System.out.println();
        Collections.reverse(newTwo);
        Collections.replaceAll(newTwo,98, 105);
        Collections.sort(randomNames);
        System.out.println(newTwo);
        System.out.println(randomNames);

    }
}