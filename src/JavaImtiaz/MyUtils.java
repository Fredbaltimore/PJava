package JavaImtiaz;

public class MyUtils {
    public static void main(String[] args) {


        int counter = 0;
        int index = 0;
        while(counter < 5){
            counter++;

            System.out.println(index+ " bop beep boop");
            index++;


        }
        System.out.println("okokok" + 4);

    }

    public static String printingThings(String s){
        return  s;
    }
    public void sumTwoNumbers(int a, int b){
        System.out.println(a + b);
    }
    public static int addTen(int i){
        return i + 10;
    }
    public static void sumAll(int... a){
        int total = 0;
        for (var y : a) {
            total += y;
        }
        System.out.println(total);

    }
    public static void productAll(double... d){
        double product = 1;
        for (var y : d){
            product *= y;
        }
        System.out.println(product);
    }
}
