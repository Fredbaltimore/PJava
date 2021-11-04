package JavaImtiaz;

import java.util.Arrays;
//Control Structures

public class Bus {


    public static void main(String[] args) {
        int month = 3;
        String mnth = null;

        switch (month){
            case 1: mnth = "Jan";
                break;
            case 2: mnth = "Feb";
                break;
            case 3: mnth = "Mar";
                break;
            case 4: mnth = "April";
                break;
            default: mnth = "retard";
                break;

        }
        System.out.println(mnth);

        int favoriteTemp = 55;
        int currentTemp = 77;
        String opinion = null;
        //nested if statement
        //if currentTemp is greater than favoriteTemp, the statements inside will
        //execute
        if(currentTemp > favoriteTemp){
            if (currentTemp < favoriteTemp){
                opinion = "frozen testicles";
            }else if (currentTemp < favoriteTemp - 20){
                opinion = "a little bit";
            }else if (currentTemp > favoriteTemp + 10){
                opinion = "Sweating";
            }else{ opinion = "Nice outside today";}


        }
        System.out.println(opinion);


        int[] randomArray = new int[100];
        boolean isHungry = true;
        int hungerRating = 4;

        if(hungerRating < 6 && isHungry && randomArray.length == 100){//parens to evaluate entire expression
            System.out.println("normal levels");
        }else{
            System.out.println("dinner time");
        }
        if(!isHungry || randomArray.length == 10){
            System.out.println("Give me food, bitch");
        }else{
            System.out.println("Ill eat it later");
        }
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] += i * 3;
        }
        System.out.println(Arrays.toString(randomArray));

    }
}
