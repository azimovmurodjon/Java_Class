package OOP;
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}

class Person {
    private String name;
    private int age;
    private Address address; // Composition: Person has an Address

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        System.out.println("My address is: " + address.getFullAddress());
    }
}

class main {
    public static void main(String[] args) {
        // Create an Address object
        Address aliceAddress = new Address("123 Main St", "Springfield", "IL", "12345");

        // Create a Person object with an address
        Person person1 = new Person("Alice", 30, aliceAddress);

        // Create another Address object
        Address bobAddress = new Address("456 Elm St", "New York", "NY", "67890");

        // Create another Person object with a different address
        Person person2 = new Person("Bob", 25, bobAddress);

        // Call methods on the objects
        person1.introduce();
        person2.introduce();

        // Update the age of person1
        person1.setAge(32);

        // Display the updated age
        System.out.println(person1.getName() + "'s new age is: " + person1.getAge());
    }
}

public class Person1 {
    private String name;
    private int age;

    // Constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
    }

    // Method to celebrate a birthday
    public void haveBirthday() {
        age++;
        System.out.println("Happy Birthday! I am now " + age + " years old.");
    }

    // Main method for example usage
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person1 person1 = new Person1("Alice", 25);
        Person1 person2 = new Person1("Bob", 30);

        // Introducing themselves
        person1.introduce();
        person2.introduce();

        // Having a birthday
        person1.haveBirthday();
        person2.haveBirthday();

        // Introducing themselves again after the birthday
        person1.introduce();
        person2.introduce();
    }
}