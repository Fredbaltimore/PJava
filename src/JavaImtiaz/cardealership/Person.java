package JavaImtiaz.cardealership;

public class Person {
    private String name;
    private String address;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person(String name){
        this.name = name;
    }
}
