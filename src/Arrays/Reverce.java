package Arrays;

import java.util.Scanner;

class ReverseofaString {


    public static void main(String[] arg) {
        ReverseofaString rev = new ReverseofaString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Reverse of a String  is : " + rev.reverse(str));
    }

    static String reverse(String s) {
        String rev = "";
        for (int j = s.length(); j > 0; --j) {
            rev = rev + (s.charAt(j - 1));
        }
        return rev;
    }
}
class Reverse
{
    public static void main(String[ ] arg)
    {
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string : ");
        str=scan.nextLine();
        System.out.println("Reverse of a String '"+str+"' is  :");
        int i=str.length();
        while(i>0)
        {
            System.out.print(str.charAt(i-1));
            i--;
        }
    }
}