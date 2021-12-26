package object.fields.object;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class Swan {
    int numEggs; //instance variable
    public static void main(String[] args){
        Swan mother = new Swan();
        mother.numEggs = 1; //set variable
        System.out.println(mother.numEggs); //read variable
    }
}
class Name{
    String first = "Murodjon";
    String last = "Azimov";
    String full;

    public static void main(String[] args) {
        Name name = new Name();
        name.full = name.first + " " + name.last;
        System.out.println(name.full);
    }
}

/**
 * When counting instance initializers, keep in mind that it does matter
 * whether the braces are inside a method. There’s only one pair of braces
 * outside a method. Line 34 is an instance initializer
 */
class instanceInitializer{
    public static void main(String[] args) {
        System.out.println("Feathers");
    }
    {System.out.println("Snowy"); }
}

/**
 * Fields and instance initializer blocks are run in the order in which they appear in the file.
 * The constructor runs after all fields and instance initializer blocks have run.
 * Let’s look at an example:
 * Order Of Initializer
 */
class Chick{
    private String name = "Fluffy";
    { System.out.println("Setting Field"); }
    public Chick(){
        name = "Tiny";
        System.out.println("Setting Constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
/**
 * Let’s look at what’s happening here. We start with the main() method
 * because that’s where Java starts execution. On line 52, we call the
 * constructor of Chick. Java creates a new object. First it initializes
 * name to "Fluffy" on line 45. Next it executes the print statement in the
 * instance initializer on line 36. Once all the fields and instance
 * initializers have run, Java returns to the constructor. Line 47 changes
 * the value of name to "Tiny" and line 48 prints another statement. At this point,
 * the constructor is done executing and goes back to the print statement on line 53.
 */

class Egg{
    public Egg(){
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    {number = 4;}
}
/**
 * If you answered 5, you got it right. Fields and blocks are run first
 * in order, setting number to 3 and then 4. Then the constructor runs,
 * setting number to 5.
 */

class integerMaxValue{
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

class Numbers{
    public static void main(String[] args) {
        System.out.println(56);     // 56
        System.out.println(0b11);   // 3
        System.out.println(017);    // 15
        System.out.println(0x1F);   // 31

        /**
         * First we have our normal base 10 value. We know you already know how to read that,
         * but bear with us. The rightmost digit is 6, so it’s “worth” 6. The second-to-rightmost
         * digit is 5, so it’s “worth” 50 (5 times 10.) Adding these together, we get 56.
         *
         * Next we have binary, or base 2. The rightmost digit is 1 and is “worth” 1.
         * The second-to- rightmost digit is also 1. In this case, it’s “worth” 2 (1 times 2)
         * because the base is 2. Add- ing these gets us 3.
         *
         * Then comes octal, or base 8. The rightmost digit is 7 and is “worth” 7. The second-to-
         * rightmost digit is 1. In this case, it’s “worth” 8 (1 times 8) because the base is 8.
         * Adding these gets us 15.
         *
         * Finally, we have hexadecimal, or base 16, which is also known as hex. The rightmost
         * “digit” is F and it’s “worth” 15 (9 is “worth” 9, A is “worth” 10, B is “worth” 11, and so forth).
         * The second-to-rightmost digit is 1. In this case, it’s “worth” 16 (1 times 16) because the
         * base is 16. Adding these gets us 31.
         */
    }
}

class understandingVariablesScope{
    static int MAX_LENGHT = 5;              // MAX_LENGHT --> is Class Variable
    int lenght;                             // lenght --> is Instance Variable
    public void grow(int inches) {          // inches and newSize --> is Local Variables
        if (lenght < MAX_LENGHT) {
            int newSize = lenght + inches;
            lenght = newSize;
        }
    }

}

//Adding Feature branch