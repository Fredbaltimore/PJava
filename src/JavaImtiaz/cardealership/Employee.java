package JavaImtiaz.cardealership;

public class Employee extends Person {
    String employeeID;
    String employeePosition;
    public Employee(String name, String employeeID, String employeePosition){
        super(name);
        this.employeeID = employeeID;
        this.employeePosition = employeePosition;
    }
    public void serveCustomer(Customer customer, boolean finance, Vehicle vehicle, Employee employee){
        if(finance == true){
            checkCreditHistory(customer, vehicle, employee);
        }else if (vehicle.getPrice() <= customer.getUpfrontPayment() ){
            processTransaction(customer, vehicle);
        }else{System.out.println("Please bring more cash");}
    }
    public void checkCreditHistory(Customer customer, Vehicle vehicle, Employee employee){//loan amount vehicle price - upfrontpayment
        double loanAmount = vehicle.getPrice() - customer.getUpfrontPayment();
        System.out.println(employee.getName() +" replies: "+"Hello " + customer.getName() + " I'll be happy to help you with that");
        System.out.println("Let me run a credit check for you and get this going ");
        System.out.println("Checking your credit history, one moment please...");

        System.out.println(customer.getName() + " you're approved for the amount of " + loanAmount);
        System.out.println("Enjoy your new " + vehicle.getModel());

    }
    public void processTransaction(Customer customer, Vehicle vehicle){
        System.out.println("Congrats " + customer.getName() + " you are the owner of a " + vehicle.getModel());

    }

}
