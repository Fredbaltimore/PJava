package duke;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class RASystem {
    public static void main(String[] args) {
        Integer[] nums = {9,8,4,32,1};
        RASystem.sortStuff(nums);
        System.out.println(Arrays.toString(nums));

        ArrayList<String> words = new ArrayList<>();
        Character[] chars = {'a','b','c','d','e','f'};
//        int charLength = chars.length -1;
        for(Character c : chars){
            words.add(String.valueOf(c));
        }
        String pWord = Arrays.toString(new ArrayList[]{words}).replaceAll("[\\[\\]]", "");
        System.out.println(words);
        System.out.println(pWord);

    }
    static void sortStuff(Integer[] arr){
        int arrayLength = arr.length - 1;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i; j++){

                if(arr[j] < arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }

    }
}
