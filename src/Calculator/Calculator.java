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

class sum1
{
    public static void main(String arg[])
    {
        int n,sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many numbers you want sum");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the "+n+" numbers ");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter  number  "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of "+n+" numbers is ="+sum);
    }
}

class sum
{
    public static void main(String arg[])
    {
        int n;
        int s=0,a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want sum");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter the "+n+" numbers ");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter  number  "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        s=sum.sumofnum(a,n-1,s);
        System.out.println("sum is ="+s);
    }
    static int sumofnum(int a[],int n,int s1)
    {
        if(n<0)
            return s1;
        else
        {
            s1+=a[n];

            return sum.sumofnum(a,n-1,s1);
        }
    }

}

class sum2
{

    public static void main(String arg[])
    {
        int n;
        int s=0,a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers you want sum");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter the "+n+" numbers ");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter  number  "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        s=sum2.sumofnum(a,n);
        System.out.println("sum is ="+s);
    }
    static int sumofnum(int a[],int n)
    {       int s1=0;
        for(int i=0;i<n;i++)
        {
            s1+=a[i];

        }
        return s1;
    }
}

class BattingAverage
{
    public static void main(String arg[])
    {
        int Matches=5,totalruns=200,innings=5,notout=1;

        double avg;

        avg=totalruns/(innings-notout);

        System.out.println("batting average="+avg);

    }
}

class BattingAverage2
{
    public static void main(String arg[])

    {

        long Matches,runs,innings,notout;

        double avg;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of matches played");

        Matches=sc.nextLong();

        while(true)
        {
            System.out.println("enter the number innings batted");

            innings=sc.nextLong();

            if(innings<=Matches)
                break;

            System.out.println("enter the number innings batted correctly <=matches");

        }


        while(true)
        {

            System.out.println("enter number of times notout");

            notout=sc.nextLong();

            if(notout<=innings)
                break;

            System.out.println("enter the number times became notout correctly <=innings");
        }

        System.out.println("enter runs scored");

        runs=sc.nextLong();

        if(innings==notout)
            avg=runs;
        else
            avg=runs/(innings-notout);

        System.out.println("batting average="+avg);

    }
}