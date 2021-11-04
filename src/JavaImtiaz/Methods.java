package JavaImtiaz;

import JavaImtiaz.cardealership.Car;


public class Methods extends MyUtils {

    public static void main(String[] args) {
        //prints out even numbers up to 100
        for (int i = 0;  i <= 100; i+=2) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 1; i <= 100; i+=2){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 50;  i >= -10; i-=2) {
            System.out.println(i);
        }
        System.out.println();


        System.out.println(printingThings(Integer.toString(33)));
        MyUtils my = new MyUtils();
        my.sumTwoNumbers(3, 44);//instance method
        Car sportsCar = new Car();
//        Engine engine = new Engine();
//        sportsCar.setType("bigengine");
//
//        sportsCar.setEngineType("V8 Hemi");
//        sportsCar.setExteriorColor("Cherry Red");
//        sportsCar.setMaxSpeed(225);
//        System.out.println(sportsCar.getExteriorColor()+"\n"+ sportsCar.getMaxSpeed()+"\n"+
//                sportsCar.getType());

        System.out.println(addTen(30));//static method
        sumAll(3, 3);
        productAll(1,2,3);

        for (int i = 40; i >= 0; i--){
            System.out.println("i: " +i);
        }


    }


}




