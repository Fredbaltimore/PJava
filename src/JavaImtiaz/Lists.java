package JavaImtiaz;
import java.util.ArrayList;
import java.util.*;
public class Lists {
    public static void main(String[] args) {
        int counter = 0;
        ArrayList<String> randomNames = new ArrayList<>();
        randomNames.add("Stupid");
        randomNames.add("Really");
        System.out.println(randomNames);
        System.out.println("Hello, World!");
        List<Integer> rnumb = new ArrayList<>();
        rnumb.add(33);
        rnumb.add(132);
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(2);
        randomNumbers.add(54);
        randomNumbers.add(567);
        rnumb.addAll(1, randomNumbers);
        System.out.println(rnumb);

        System.out.println(randomNumbers);
        for(int i = 30; i >= 0; i-=2){
            System.out.println(i);
        }
        String[] names = {"Rick", "John", "Robert", "Ernest", "Derrick"};
        String str = Arrays.toString(names).replaceAll("[\\[\\],]", "");
        System.out.println(str);
        for(String name : names){
            System.out.println(counter +" " +name);
            counter++;
        }
    }
}
