package JavaImtiaz;

import java.io.IOException;

public class FileS  {
    public static void main(String[] args) throws IOException {
        PersonOne personOne = new PersonOne("richard","Berry", 34);
        int p = personOne.age();
        System.out.println(personOne.firstName());
        System.out.println(p);
        System.out.println(personOne);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter text to go in the file ");
//        String t = sc.nextLine();
//        File f = new File("D:\\new-space\\PJava\\src\\JavaImtiaz\\sr.txt");
//        FileWriter fw = new FileWriter(f);
//
//        fw.append(t);
//        fw.append("\nappending more text\n");
//        fw.append("moreeeeeeee");
//        fw.close();
        int mo = 41 % 3;
        int moo = 41 % 5;
        int m = 41 % 7;
        System.out.println(mo);
        System.out.println(moo);
        System.out.println(m);
        int d = 25 / 2;
        System.out.println(d);
        System.out.println(2 + 4 * 5 - 10 / (2 + 1));
        System.out.println(-30 / 7);
        System.out.println((-5) * (-10) * (-20));
        System.out.println(-10 * (3 + 4) / 2);
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
        String str = """
                Hello
                Assholes
                Again
                """;
        System.out.println(str);



    }
}
