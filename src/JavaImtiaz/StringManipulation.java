package JavaImtiaz;

public class StringManipulation {
    public static void main(String[] args) {
        String name = "Frederick";
        String a = "Hello";
        String b = "Help";
        String str = "We have a large inventory of things in our warehouse"
                +" falling in the category:apparel and the slightly"
                +" more in demand category:makeup along with the category:furniture and..";
        printCatagories(str);

        System.out.println(b.charAt(3));
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (b.equalsIgnoreCase("burp")){
            System.out.println("oops");
        }else System.out.println("oggggggggggg");


        String alphaChunk = alphabet.substring(4,15);
        //loop through string in reverse
        int alphabetLength = alphabet.length() - 1;
        for (int i = alphabetLength; i >= 0; i--){
            System.out.println("Character: " + alphabet.charAt(i));
        }
        System.out.println(alphaChunk);
        String subName = name.substring(2,5);
        System.out.println(subName);
        System.out.println(b.substring(1,3));
        System.out.println(a.length());
        System.out.println(name.length());
    }

    public static void printCatagories(String str){
        int i = 0;

        while(true){
            int found = str.indexOf("category:", i);
            if(found == -1) break;
            int start = found + 9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end + 1;
        }

    }
}
