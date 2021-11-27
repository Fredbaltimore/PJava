package JavaImtiaz;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Trees {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        HashMap<String, String> dictionary = new HashMap<>();
        LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        myMap.put("Key", "The value to this key");
        System.out.println(myMap);
        System.out.println();
        dictionary.put("Important", "of great significance or value");
        dictionary.put("Brilliant", "exceptionally clever or talented");
        dictionary.put("Super", "very good or pleasant; excellent");
        dictionary.put("Fred", "Greatness");
        System.out.println();
        linkedMap.put("Important", "of great significance or value");
        linkedMap.put("Brilliant", "exceptionally clever or talented");
        linkedMap.put("Super", "very good or pleasant; excellent");
        linkedMap.put("Fred", "Greatness");
        System.out.println();
        treeMap.put("Important", "of great significance or value");
        treeMap.put("Brilliant", "exceptionally clever or talented");
        treeMap.put("Super", "very good or pleasant; excellent");
        treeMap.put("Fred", "Greatness");
        String dictionaryItem = dictionary.get("Important");
        boolean dictionaryItem2 = dictionary.containsKey("Fred");
        dictionary.replace("Fred", "Super Super Great");

        System.out.println("HashMap");

        System.out.println(dictionaryItem2);
        System.out.println("Get Method "+dictionaryItem);
        for ( String item: dictionary.values()) {
            System.out.println(item);

        }
        System.out.println();
        for ( String item: dictionary.keySet()) {
            System.out.println(item);

        }
        System.out.println("TreeMap");
        for(String tMap : treeMap.values()){
            System.out.println(tMap);
        }

    }

}
