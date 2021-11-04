package JavaImtiaz.cardealership;

public class Truck extends Vehicle {
    public Truck(String make, String model, double price, int year) {
        super(make, model, price, year);
    }

    public Truck(String make, String model, String exteriorColor, String interiorColor, int year,
                 int numWheels, int mileage) {
        super(make, model, exteriorColor, interiorColor, year, numWheels, mileage);
    }

    public void start(){
        System.out.println("Truck is starting up....");
    }
}
