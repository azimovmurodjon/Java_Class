package Calculator;
import java.util.Scanner;
import java.io.*;


class GFG {
    public static void main(String args[]) {
        double principal = 10000, rate = 10.25, time = 5;

        /* Calculate compound interest */
        double CI = principal *
                (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is " + CI);
    }
}

class PerimeterOfRhombus
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the side of the Rhombus:");

        double a= s.nextDouble();

        double  perimeter=4*a;

        System.out.println("perimeter of Rhombus is: " + perimeter);
    }
}

class PerimeterOfRhombus1
{
    public static void main(String args[])
    {

        double a= Double.parseDouble(args[0]);

        double  perimeter=4*a;

        System.out.println("perimeter of Rhombus is: " + perimeter);
    }
}