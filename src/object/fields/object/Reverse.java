package object.fields.object;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Locale;

/*
* Java Program to reverse a word
*/

public class Reverse {
    public static void main(String[] args) {

        String str = "Geeks", nstr = "";
        char ch;

        System.out.println("Original Word: ");
        System.out.println("Geeks"); //Example words
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //Extracts each character
            nstr = ch + nstr; //Adds each character in front of the existing
        }
        System.out.println("Reversed word: " + nstr.toLowerCase(Locale.ROOT));
    }
}
   /*
   * Java Program to ReverceString using ByteArray
   */

class ReverseString_using_ByteArray{
        public static void main(String[] args) {
            String input = "GeeksforGeeks";
            //getByte() method to convert String
            //into bytes[].
            byte[] strAsByteArray = input.getBytes();
            byte[] result = new byte[strAsByteArray.length];
            //Store result in reverse order into the
            //result byte[]
            for (int i = 0; i < strAsByteArray.length; i++){
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];
                System.out.println(new String((result)));
            }
        }
    }
    /*
    * Java Program to ReverseString using StringBuilder
    */
class ReverseString_using_StringBuilder{
    public static void main (String[] args){
        String input = "Geeks for Geeks";
        StringBuilder input1 = new StringBuilder();
        //append a string into StringBuilder input1
        input1.append(input);
        // reverse StringBuilder input1
        input1.reverse();
        System.out.println(input1);
         }
}

    /*
    * Java Program to Reverse a String by
    * converting string to characters one bye one
    */
class ReverseString_Using_Character_one_by_one{
        public static void main(String[] args) {
            String input = "GeeksForGeeks";
            //convert String to character
            //by using toCharArray
            char[] try1 = input.toCharArray();
            for (int i = try1.length - 1; i >= 0; i--){
                System.out.print(try1[i]);
            }
             }
    }

    class string_method_ending_two_character{
    public String endTwo(String str){
        return (str.substring(str.length()-2));
    }
    public String onlyFirstTwoCharacter(String str){
        return str.substring(0,2);
    }
        public static void main(String[] args) {
        string_method_ending_two_character str = new string_method_ending_two_character();
        String hello = "Hello";
            System.out.println(str.endTwo(hello));
            System.out.println(str.onlyFirstTwoCharacter(hello));
        }
    }