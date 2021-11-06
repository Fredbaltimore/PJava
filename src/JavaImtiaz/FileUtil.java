package JavaImtiaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
    public static void main(String[] args) {

        try {
            //reading random txt file
            File file = new File("src/JavaImtiaz/random.txt");
            Scanner scanner;
            //scanner to read the file
            scanner = new Scanner(file);
            //while scanner has next line, meaning as long as lines of text
            //are in the file
            while (scanner.hasNextLine()){
                String lines = scanner.nextLine();
                System.out.println(lines);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
