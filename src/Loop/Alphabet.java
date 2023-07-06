package Loop;

/*
Output

* is not an alphabet.
In Java, the char variable stores the ASCII value of a character (number between 0 and 127) rather than the character itself.

The ASCII value of lowercase alphabets are from 97 to 122. And, the ASCII value of uppercase alphabets are from 65 to 90. That is, alphabet a is stored as 97 and alphabet z is stored as 122. Similarly, alphabet A is stored as 65 and alphabet Z is stored as 90.

Now, when we compare variable c between 'a' to 'z' and 'A' to 'Z', the variable is compared with the ASCII value of the alphabets 97 to 122 and 65 to 90 respectively.

Since the ASCII value of * does not fall in between the ASCII value of alphabets. Hence, the program outputs * is not an alphabet.
 */
public class Alphabet {
    public static void main(String[] args) {

        char c = '*';

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}

/*
A is an alphabet.
In the above program, the if else statement is replaced with ternary operator (? :).
 */
class Alphabet2 {
    public static void main(String[] args) {

        char c = 'A';

        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";

        System.out.println(output);
    }
}

/*
Output

a is an alphabet.
In the above example, notice the expression,

Character.isAlphabetic(c)
Here, we have used the isAlphabetic() method of the Character class. It returns true if the specified variable is an alphabet. Hence, the code inside if block is executed.
 */
class Alphabet3 {
    public static void main(String[] args) {

        // declare a variable
        char c = 'a';

        // checks if c is an alphabet
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}

