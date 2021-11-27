import java.util.*;

public class Main {

    public static void main(String[] args) {
        //convert hashset to list
        HashSet<Integer> listOne = new HashSet<>();
        listOne.add(23);
        listOne.add(33);
        listOne.add(455);
        listOne.add(44);
        listOne.add(55);
        listOne.add(66);

        //populates arrayList with values from hashset
        List<Integer> lst = new ArrayList<>(listOne);
        Collections.sort(lst);
        System.out.println(lst);
        //array LISTS to perform collection methods on
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> anotherList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            anotherList.add(i);

        }
        for (int i = 0; i <= 2 ; i++) {
            newList.add(i);

        }
        //adds all of the elements newList to end of anotherList
        anotherList.addAll(newList);
        System.out.println(anotherList);
        System.out.println(newList);
        ArrayList<Integer> ray = new ArrayList<>();
        ray.add(1);
        ray.add(0);
        //removes all instances of the number in ray that exists in anotherList
        anotherList.removeAll(ray);
        System.out.println(anotherList);
        //contains checks if element exists in list
        boolean hasValue = anotherList.contains(2);
        System.out.println("hasValue tested with contains method");
        System.out.println(hasValue);
        //isEmpty method
        System.out.println("isEmpty checks if list is empty or not below");
        boolean empty = anotherList.isEmpty();
        System.out.println(empty);

        //retainAll is used to remove everything ACCEPT for values you'd like to retain
        System.out.println("retainAll");
        anotherList.retainAll(newList);
        System.out.println(anotherList);
        //clear method removes all elements of collection
        anotherList.clear();

        System.out.println("Clear method");
        System.out.println(anotherList);
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
