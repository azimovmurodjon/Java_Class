package Constructor;

public class Constractors {
    public static void main(String[] args) {

    /*
    this is for saperate Constractor coll
     */
        Dog getMyDogName = new Dog("Keanu");
        Dog getMyDogAge = new Dog(23);
        System.out.println(getMyDogName + " " + getMyDogAge);

    /*
    or we can use multiple value  for constractor at the same time
     */
        Dog getmyDogAgeAndName = new Dog("Keanu", 23);
        System.out.println(getmyDogAgeAndName);

        /*
        We can use Private Constractor as well next method will show ho it does work
         */
        //Constence c = new Constence(); // this Constractor will show us error message that it is not visable but we can still use the methods inside of this class

        System.out.println(Constence.NUMBER_OF_MONTH_IN_A_YEAR);

    }

}
