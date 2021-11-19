package duke;

import java.util.ArrayList;
import java.util.Arrays;

public class RASystem {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Character[] chars = {'a','b','c','d','e','f'};
//        int charLength = chars.length -1;
        for(Character c : chars){
            words.add(String.valueOf(c));
        }
        String pWord = Arrays.toString(new ArrayList[]{words}).replaceAll("[\\[\\]]", "");

        System.out.println(pWord);

    }
}
