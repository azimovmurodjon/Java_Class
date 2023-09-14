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

class PerimeterOfRhombus1
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

class PerimeterOfRhombus2
{
    public static void main(String args[])
    {

        double a= Double.parseDouble(args[0]);

        double  perimeter=4*a;

        System.out.println("perimeter of Rhombus is: " + perimeter);
    }
}

class PerimeterOfRhombus
{

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the side of the Rhombus:");

        double a= s.nextDouble();

        double  perimeter=PerimeterOfRhombus.area(a);

        System.out.println("perimeter of Rhombus is: " + perimeter);
    }
    public static double area(double l)
    {

        double  a=4*l;

        return a;
    }



}

class PerimeterOfParallelogram1
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the height of the Parallelogram:");

        double h= s.nextDouble();

        System.out.println("Enter the breadth of the Parallelogram:");

        double b= s.nextDouble();

        double  perimeter=2*(h+b);

        System.out.println("perimeter of Parallelogram is: " + perimeter);
    }
}

class PerimeterOfParallelogram2 {
    public static void main(String args[]) {

        double h = Double.parseDouble(args[0]);

        double b = Double.parseDouble(args[1]);

        double perimeter = 2 * (h + b);

        System.out.println("perimeter of Parallelogram is: " + perimeter);
    }
}

class PerimeterOfParallelogram
{

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the height of the Parallelogram:");

        double h= s.nextDouble();

        System.out.println("Enter the breadth of the Parallelogram:");

        double b= s.nextDouble();

        double  perimeter=PerimeterOfParallelogram.area(h,b);

        System.out.println("perimeter of Parallelogram is: " + perimeter);
    }
    public static double area(double h,double b)
    {

        double  a=2*(h+b);

        return a;
    }


}