package JavaImtiaz.cardealership;

public class Vehicle {
    private String make;
    private String model;
    private String exteriorColor;
    private String interiorColor;
    private String plateNumber;
    private int year;
    private int numWheels;
    private int mileage;
    private double price;




    public Vehicle(){}
    public Vehicle(String make, String model, double price, int year ){
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public Vehicle(String make, String model, String exteriorColor, String interiorColor, int year,
                   int numWheels, int mileage) {
        this.make = make;
        this.model = model;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.year = year;
        this.numWheels = numWheels;
        this.mileage = mileage;
    }

    public void start(){}
    public void stop(){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
