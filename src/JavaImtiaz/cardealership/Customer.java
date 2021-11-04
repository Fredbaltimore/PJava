package JavaImtiaz.cardealership;

public class Customer extends Person {

    private double upfrontPayment;
    private boolean finance;

    public Customer(String name, String address, double upfrontPayment, boolean finance){
        super(name, address);
        this.upfrontPayment = upfrontPayment;
        this.finance = finance;
    }

    public double getUpfrontPayment() {
        return upfrontPayment;
    }

    public void setUpfrontPayment(double upfrontPayment) {
        this.upfrontPayment = upfrontPayment;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public void buyCar(Vehicle vehicle, Employee employee, boolean finance, Customer customer){
        System.out.println(customer.getName()+ " replies: "+"Hello " + employee.getName() + " I'd like to purchase the " + vehicle.getModel());
    }
}
