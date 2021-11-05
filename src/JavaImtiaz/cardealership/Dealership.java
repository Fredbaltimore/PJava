package JavaImtiaz.cardealership;

public class Dealership {
    public static void main(String[] args) {
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.println("\uD835\uDE52\uD835\uDE5A\uD835\uDE61\uD835\uDE58\uD835\uDE64\uD835\uDE62\uD835\uDE5A \uD835\uDE69\uD835\uDE64 \uD835\uDE51\uD835\uDE67\uD835\uDE64\uD835\uDE64\uD835\uDE62\uD835\uDE68 \uD835\uDE3C\uD835\uDE6A\uD835\uDE69\uD835\uDE64\n" +
                "\uD835\uDE3E\uD835\uDE56\uD835\uDE67\uD835\uDE68, " +
                "\uD835\uDE4F\uD835\uDE67\uD835\uDE6A\uD835\uDE58\uD835\uDE60\uD835\uDE68, " +
                "\uD835\uDE56\uD835\uDE63\uD835\uDE59 \uD835\uDE5A\uD835\uDE6B\uD835\uDE5A\uD835\uDE63 \uD835\uDE48\uD835\uDE64\uD835\uDE69\uD835\uDE64\uD835\uDE67\uD835\uDE58\uD835\uDE6E\uD835\uDE58\uD835\uDE61\uD835\uDE5A\uD835\uDE68");
        System.out.println("* * * * * * * * * * * * * * * * * * ");
        Vehicle carVroom = new Car("Vroom", "Roadster",20000, 2021);
        Vehicle truckVroom = new Truck("Vroom", "Thumper",25000, 2021);
        Vehicle motorCycleVroom = new Motorcycle("Vroom", "Speedster",12000, 2021);
        Employee employeeOne = new Employee("Ronald","22345", "Car Salesmen");
        Employee employeeTwo = new Employee("James", "22355", "Head Car Salesmen");
        Customer c = new Customer("Robert Fisher", "4545 Maple Drive",15000, true);
        c.buyCar(carVroom, employeeTwo, c);
        employeeTwo.serveCustomer(c, carVroom, employeeTwo);
    }
}
