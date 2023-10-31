package Loop;
import java.util.Scanner;
/*
Output

Sum = 5050
The above program loops from 1 to the given num(100) and adds all numbers to the variable sum.
 */
public class SumNatural {
    public static void main(String[] args) {

        int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

/*
Output

Sum = 1275
In the above program, unlike a for loop, we have to increment the value of i inside the body of the loop.

Though both programs are technically correct, it is better to use for loop in this case. It's because the number of iteration (up to num) is known.
 */
class SumNatural2 {
    public static void main(String[] args) {

        int num = 50, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}


class Leapyear
{
    public static void main(String arg[])
    {
        long a,y,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  any  calendar year :");
        y=sc.nextLong();
        if(y!=0)
        {
            a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));
            if(a==1)
                System.out.println(y+" is a leap year");
            else
                System.out.println(y+" is not a leap year");
        }
        else
            System.out.println("year zero does not exist ");
    }
}

