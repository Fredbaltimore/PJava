package JavaImtiaz.cardealership;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, double price, int year) {
        super(make, model, price, year);
    }

    public Motorcycle(String make, String model, String exteriorColor, String interiorColor, int year,
                      int numWheels, int mileage) {
        super(make, model, exteriorColor, interiorColor, year, numWheels, mileage);
    }

    public void start(){
        System.out.println("Motorcycle is starting up..");
    }
    public static void main(String[] args) {

    }
}
