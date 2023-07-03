package Constructor;

public class Dog {
    String dogName;
    int dogAge;
   public Dog(){

   }
    public Dog(String name){
        this.dogName = name;

    }
    /*
    We can use Two saperate Constractor
     */
    public Dog(int age){
        this.dogAge = age;
    }

    /*
    Or We can use one Constractor that will allow us to use multiple values
     */

    public Dog(String name, int age){
        this.dogName = name;
        this.dogAge = age;
    }
}
