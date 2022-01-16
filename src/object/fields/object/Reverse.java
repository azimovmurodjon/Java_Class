package object.fields.object;

import java.nio.charset.StandardCharsets;
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

    class ReverseString{
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
