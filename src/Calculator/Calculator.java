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

class BattingAverage3
{
    public static void main(String args[])
    {
        double Mat,inn,notout,avg,run;

        Mat=Double.parseDouble(args[0]);

        inn=Double.parseDouble(args[1]);

        notout=Double.parseDouble(args[2]);

        run=Double.parseDouble(args[3]);

        System.out.println("Matches="+(long)Mat);

        System.out.println("Innings="+(long)inn);

        System.out.println("Notout="+(long)notout);

        System.out.println("Total runs="+(long)run);

        if(inn<=Mat&&notout<=inn)
        {
            avg=run /(inn-notout);

            System.out.println("batting average="+avg);
        }
        else
        {
            System.out.println("please enter innings <= matches and notout<=innings" );
        }

    }
}

class AvgCalculation
{
    double avg=0;

    AvgCalculation(long r,long i,long n)
    {
        if(i==n)
        {
            avg=r;
        }
        else
        {
            avg=r/(i-n);
        }
    }

}

class BattingAverage4
{
    public static void main(String arg[])
    {
        long Matches,runs,innings,notout;

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

        AvgCalculation a=new AvgCalculation(runs,innings,notout);

        System.out.println("batting average="+a.avg);

    }

}

class Lcm
{
    public static void main(String arg[])
    {
        long a,b,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number 1");
        a=sc.nextLong();
        System.out.println("enter  number 2");
        b=sc.nextLong();
        lcm=lcmCalculation(a,b);
        System.out.println("LCM of "+a+" and "+b+" is ="+lcm);
    }
    static long lcmCalculation(long n1,long n2)
    {
        long temp,i=2,res;
        if(n1>n2)
            res=n1;
        else
            res=n2;
        temp=res;
        while(res%n1!=0 || res%n2!=0)
        {
            res=temp*i;
            i++;
        }
        return res;

    }
}

class Lcm2
{
    public static void main(String args[])
    {
        long n1,n2,i=2,lcm,b;
        n1=Long.parseLong(args[0]);
        n2=Long.parseLong(args[1]);
        if(n1>n2)
            lcm=n1;
        else
            lcm=n2;
        b=lcm;
        while(lcm%n1!=0 || lcm%n2!=0)
        {
            lcm=b*i;
            i++;
        }

        System.out.println("LCM of "+n1+" and "+n2+" is ="+lcm);
    }
}

class Lcm4
{
    public static void main(String args[])
    {
        long n1,n2,i=2,lcm,b;
        n1=Long.parseLong(args[0]);
        n2=Long.parseLong(args[1]);
        if(n1>n2)
            lcm=n1;
        else
            lcm=n2;
        b=lcm;
        while(lcm%n1!=0 || lcm%n2!=0)
        {
            lcm=b*i;
            i++;
        }

        System.out.println("LCM of "+n1+" and "+n2+" is ="+lcm);
    }
}

class Lcm5
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int inputArray[]=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            inputArray[i]=sc.nextInt();
        }
        long lcm=lcmCalculation(inputArray[0],inputArray[1]);
        for(int i=2;i<n;i++)
        {
            lcm=lcmCalculation(lcm,inputArray[i]);
        }
        System.out.println("The Least Common Multiple of "+n+" numbers is : " + lcm);
    }
    static long lcmCalculation(long n1,long n2)
    {
        long temp,i=2,res;
        if(n1>n2)
            res=n1;
        else
            res=n2;
        temp=res;
        while(res%n1!=0 || res%n2!=0)
        {
            res=temp*i;
            i++;
        }
        return res;

    }
}

class Lcm3
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int inputArray[]=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            inputArray[i]=sc.nextInt();
        }
        long lcm=lcmCalculation(inputArray[0],inputArray[1]);
        for(int i=2;i<n;i++)
        {
            lcm=lcmCalculation(lcm,inputArray[i]);
        }
        System.out.println("The Least Common Multiple of "+n+" numbers is : " + lcm);
    }
    static long lcmCalculation(long n1,long n2)
    {
        long temp,i=2,res;
        if(n1>n2)
            res=n1;
        else
            res=n2;
        temp=res;
        while(res%n1!=0 || res%n2!=0)
        {
            res=temp*i;
            i++;
        }
        return res;

    }
}