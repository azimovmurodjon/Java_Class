package OOP;

// Define the Person class
class Person {
    // Attributes or instance variables
    private String name;
    private int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Getter method for the age
    public int getAge() {
        return age;
    }

    // Setter method for the age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
class main {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Call methods on the objects
        person1.introduce();
        person2.introduce();

        // Update the age of person1
        person1.setAge(32);

        // Display the updated age
        System.out.println(person1.getName() + "'s new age is: " + person1.getAge());
    }
}

