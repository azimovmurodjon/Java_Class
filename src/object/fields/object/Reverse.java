package object.fields.object;

import java.util.Locale;

public class Reverse {
   public static void main (String[] args){

       String str = "Geeks", nstr = "";
       char ch;

       System.out.println("Original Word: ");
       System.out.println("Geeks"); //Example words
       for (int i = 0; i<str.length(); i++){
           ch = str.charAt(i); //Extracts each character
           nstr = ch+nstr; //Adds each character in front of the existing
       }
       System.out.println("Reversed word: " + nstr.toLowerCase(Locale.ROOT));
   }
}
