package JavaImtiaz;

public class ForLoops {
    public static void main(String[] args) {
        int c = 0;
        //prints out even numbers up to 100
        for (int id = 0; id < 20; id++){
            for(int j = 0; j < 8; j+=2){
                for(int k = 0; k < 6; k++){
                    System.out.println("value of id is " +id+"----" + j+ "----" +k);
                    c++;
                }

            }
            System.out.println(c);
        }
        System.out.println("\nEven Numbers\n");
        for (int i = 0;  i <= 100; i+=2) {
            System.out.println(i);
        }
        System.out.println("\nOdd Numbers\n");
        //prints out even numbers up to 100
        for (int i = 1; i <= 100; i+=2){
            System.out.println(i);
        }
        System.out.println("\nBackwards Negative Even Numbers \n");
        //prints out odd numbers
        for (int i = 50;  i >= -10; i-=2) {
            System.out.println(i);
        }

    }
}
