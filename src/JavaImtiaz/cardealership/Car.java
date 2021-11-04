package JavaImtiaz.cardealership;

public class Car extends Vehicle {
    public Car(){}

    public Car(String make, String model, double price, int year) {
        super(make, model, price, year);
    }

    public Car(String make, String model, String exteriorColor, String interiorColor, int year,
               int numWheels, int mileage) {
        super(make, model, exteriorColor, interiorColor, year, numWheels, mileage);
    }

    public void start(){
        System.out.println("Car is starting up...");
    }
}
