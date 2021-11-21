import java.util.*;

public class Main {

    public static void main(String[] args) {
        //hashsets don't allow duplicates
        HashSet<Integer> hNumbers = new HashSet<>();
        hNumbers.add(32);
        hNumbers.add(32);
        hNumbers.add(33);
        hNumbers.add(12);
        for (Integer n : hNumbers){
            System.out.println(n);
        }
        //doesnt allow duplicates and maintains order of insertion
        LinkedHashSet<Integer> lHashSet = new LinkedHashSet<>();
        lHashSet.add(33);
        lHashSet.add(33);
        lHashSet.add(32);
        lHashSet.add(21);
        for (var s: lHashSet) {
            System.out.println(s);

        }
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Owl");
        animals.add("Wolf");
        for (var animal : animals){
            System.out.println(animal);
        }

        Integer[] ints = {10,4,6,2,8};
        srt(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println("----------");

	    ArrayList<Integer> numbersArray = new ArrayList<>();
        for (int i = 2; i < 15 ; i +=2) {
            numbersArray.add(i);
        }
        System.out.println(numbersArray.get(2));
        int itemOne = numbersArray.get(1);
        int itemTwo = numbersArray.get(3);
        int totalItems = itemOne + itemTwo;
        System.out.println(totalItems);
        String nStr = Arrays.toString(new ArrayList[]{numbersArray});
        String str = nStr.replaceAll("[\\[\\],]", "");
        System.out.println(str);
        System.out.println(numbersArray.get(1));

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Something");
        linked.add("Something else");
        linked.add("Sometin");
        var li =  linked.listIterator();
        int counter = 0;
        while(li.hasNext()){
            System.out.println(counter+" "+li.next());
            counter++;
        }
//        System.out.println(linked.get(1));
//        System.out.println(linked);

        LinkedHashSet<String> linkedHash = new LinkedHashSet<>();
        linkedHash.add("Node One");
        linkedHash.add("Node Two");
        linkedHash.add("Node Three");
        linkedHash.add("Node Four");

        linkedHash.forEach(System.out::println);

    }
    static void srt(Integer[] array){
        int arrayLength = array.length - 1;
        for (int i = 0; i <arrayLength; i++) {
            for (int j = 0; j < arrayLength - i; j++){
                if (array[j] < array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
