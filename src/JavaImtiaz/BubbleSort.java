package JavaImtiaz;

import java.util.Arrays;

public class BubbleSort {
    static void sortBubble(Integer[] a){
        int length = a.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {7, 5, 3, 2, 1};
        BubbleSort.sortBubble(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
