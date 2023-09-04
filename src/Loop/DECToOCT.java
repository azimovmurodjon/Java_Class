package Loop;

import java.math.BigInteger;

/*
In this program, we've used for loop to loop through all numbers between 1 and the given number num (10), and the product of each number till num is stored in a variable factorial.

We've used long instead of int to store large results of factorial. However, it's still not big enough to store the value of bigger numbers (say 100).

For results that cannot be stored in a long variable, we use BigInteger variable declared in java.math library.
 */
public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

}

/*
Here, instead of long, we use BigInteger variable factorial.
Output Factorial of 30 = 265252859812191058636308480000000
Since, * cannot be used with BigInteger, we instead use multiply() for the product. Also, num should be casted to BigInteger for multiplication.
 */
class Factorial2 {
    public static void main(String[] args) {

        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

class Factorial3 {
    public static void main(String[] args) {

        int num = 5, i = 1;
        long factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

