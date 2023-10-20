package freeCodeCamp;

public class Variables_v_0_1 {
    public static void main(String[] args) {
        char letter = 'A';
        boolean isActive = true;
        System.out.println("Letter is " + letter);
        System.out.println(isActive);

    }
}
class main{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println((num1 + num2) * 4);

        // abbreviation

        int myNumber = 0;
        myNumber += 4;
        System.out.println(myNumber);

        myNumber -= 4;
        System.out.println(myNumber);

        myNumber *= 4;
        System.out.println(myNumber);

        myNumber /= 4;
        System.out.println(myNumber);

        myNumber %= 4;
        System.out.println(myNumber);

        myNumber = 4;
        System.out.println("Postfix Incrementation " + myNumber++);
        System.out.println("Prefix Incrementation "+ ++myNumber);

        System.out.println("Postfix Decrementation " + myNumber--);
        System.out.println("Prefix Decrementation "+ --myNumber);

    }
}
