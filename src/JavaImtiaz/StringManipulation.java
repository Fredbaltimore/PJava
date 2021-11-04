package JavaImtiaz;

public class StringManipulation {
    public static void main(String[] args) {
        String name = "Frederick";
        String a = "Hello";
        String b = "Help";
        String str = "We have a large inventory of things in our warehouse"
                +" falling in the category:apperal and the slightly"
                +" more in demand category:makeup along with the category:furniture and..";

        System.out.println(b.charAt(3));
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (b.equalsIgnoreCase("burp")){
            System.out.println("oops");
        }else System.out.println("oggggggggggg");


        String alphaChunk = alphabet.substring(4,15);
        //loop through string in reverse
        for (int i = alphabet.length() - 1; i >= 0; i--){
            System.out.println("Character: " + alphabet.charAt(i));
        }
        System.out.println(alphaChunk);
        String subName = name.substring(2,5);
        System.out.println(subName);
        System.out.println(b.substring(1,3));
        System.out.println(a.length());
        System.out.println(name.length());
    }
}
