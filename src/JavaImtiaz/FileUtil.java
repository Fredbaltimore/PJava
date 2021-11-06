package JavaImtiaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
    public static void main(String[] args) {
        //takes user input asking for name and prints out greeting with the users name they just entered
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        try {
            //reading random txt file
            File file = new File("src/JavaImtiaz/random");
            //scanner to read the file
            Scanner scanner = new Scanner(file);
            //while scanner has next line, meaning as long as lines of text
            //are in the file
            while (scanner.hasNextLine()){
                //line of text will be stored in lines
                String lines = scanner.nextLine();
                //prints out each line
                System.out.println(lines);
            }
            //closing scanner when while loop is finished
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
