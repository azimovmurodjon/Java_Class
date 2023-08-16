package Amigoscode;

public class Main {

    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}

class Swap_with_thirt_varable{
    public static void main(String[] args) {
        String a = "first a";
        String b = "string b";
        String temp = "";

        temp = a;
        a = b;
        b = temp;


        System.out.println("Printing A = " + a + " printing b = "+ b);
    }
}
class primitives_referances{
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;

        System.out.println(" a = " + a + " - b "+ b);
    }
}
