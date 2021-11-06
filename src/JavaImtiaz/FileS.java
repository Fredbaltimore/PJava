package JavaImtiaz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileS  {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\new-space\\PJava\\src\\JavaImtiaz\\sr.txt");
        FileWriter fw = new FileWriter(f);
//        fw.write("Added text to the file");
        fw.append("appending more text \n");
        fw.append("moreeeeeeee");
        fw.close();
    }
}
