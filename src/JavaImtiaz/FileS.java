package JavaImtiaz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileS  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to go in the file ");
        String t = sc.nextLine();
        File f = new File("D:\\new-space\\PJava\\src\\JavaImtiaz\\sr.txt");
        FileWriter fw = new FileWriter(f);
//        fw.write("Added text to the file");
        fw.append(t);
        fw.append("\nappending more text\n");
        fw.append("moreeeeeeee");
        fw.close();
    }
}
