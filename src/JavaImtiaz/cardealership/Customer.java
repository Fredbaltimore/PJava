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

    public void buyCar(Vehicle vehicle, Employee employee, Customer customer){
        String financedOrNot = null;
        if(!finance){
            financedOrNot = "not willing";

        }else financedOrNot = "willing";

        System.out.println(customer.getName()+ " says: "+"Hello " + employee.getName() + " I'd like to purchase the "
                + vehicle.getModel() + " and have " +customer.getUpfrontPayment()
                + " upfront to lay down on it" +  " and " +financedOrNot+ " to finance");
    }
}
