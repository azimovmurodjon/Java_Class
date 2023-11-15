package Loop;
import java.util.*;
import java.util.Scanner;

class DECToOCT {
    static int i = 1;

    public static void main(String args[]) {
        int dec, rem, q, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dec number: ");
        dec = sc.nextInt();
        System.out.println("Oct number is : ");
        int[] oct = octal(dec);
        for (int c = i - 1; c > 0; c--) {
            System.out.print(oct[c]);
        }

    }

    static int[] octal(int q) {
        int a[] = new int[50];
        while (q != 0) {
            a[i++] = q % 8;
            q = q / 8;
        }
        return a;
    }
}

class DECToOCT2 {
    static int i = 1;

    public static void main(String args[]) {
        int dec, rem, q, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dec number: ");
        dec = sc.nextInt();
        System.out.println("Oct number is : ");
        int[] oct = octal(dec);
        for (int c = i - 1; c > 0; c--) {
            System.out.print(oct[c]);
        }

    }

    static int[] octal(int q) {
        int a[] = new int[50];
        while (q != 0) {
            a[i++] = q % 8;
            q = q / 8;
        }
        return a;
    }
}

class DECToOCT3 {
    static int oct[] = new int[50], i = 1;

    int[] octal(int q) {
        if (q != 0) {
            oct[i++] = q % 8;
            q = q / 8;
            octal(q);
        }
        return oct;
    }

    public static void main(String args[]) {
        DECToOCT d = new DECToOCT();
        int dec, rem, q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dec number: ");
        dec = sc.nextInt();
        System.out.println("Oct number is : ");
        int[] oct = d.octal(dec);
        for (int c = i - 1; c > 0; c--) {
            System.out.print(oct[c]);
        }

    }
}
class DECToOCT4
{
    static int i=1;
    public static void main(String args[])
    {
        int dec, rem,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dec number: ");
        dec=sc.nextInt();
        System.out.println("Oct number is : ");
        int a[] = new int[50];
        while(dec!= 0)
        {
            a[i++] = dec%8;
            dec= dec/8;
        }
        for(int c=i-1;c>=0;c--)
        {
            System.out.print(a[c]);
        }

    }
}

class DectoBin
{
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n=sc.nextInt();
        int  bin[]=new int[100];
        int i = 0;
        while(n > 0)
        {
            bin[i++] = n%2;
            n = n/2;
        }
        System.out.print("Binary number is : ");
        for(int j = i-1;j >= 0;j--)
        {
            System.out.print(bin[j]);
        }
    }
}
class DtoB
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n=sc.nextInt();
        System.out.print("Binary number is : ");
        binary(n);

    }
    static void  binary(int num)
    {
        int i = 0;
        int  bin[]=new int[100];
        bin[0]=0;
        while(num>0)
        {
            bin[i++] = num%2;
            num = num/2;
        }
        for(int j =i-1;j >= 0;j--)
        {
            System.out.print(bin[j]);
        }
    }
}
class DecimaltoBinary
{
    int  bin[]=new int[100],i = 0;
    void  binary(int num)
    {
        if(num>0)
        {
            bin[i++] = num%2;
            num = num/2;
            binary(num);
        }
        for(i=i-1;i >= 0;i--)
        {
            System.out.print(bin[i]);
        }

    }
    public static void main(String arg[])
    {
        DecimaltoBinary d=new DecimaltoBinary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n=sc.nextInt();
        System.out.print("Binary number is : ");
        d.binary(n);

    }
}

class DtoB2
{
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> s= new Stack<Integer>();   // Create Stack object
        System.out.println("Enter decimal number: ");
        int n = sc.nextInt();
        while(n != 0)
        {
            int d = n % 2;
            s.push(d);
            n /= 2;
        }
        System.out.print("Binary representation is : ");
        while (!(s.isEmpty() ))
        {
            System.out.print(s.pop());
        }
    }
}

class Char
{
    public static void main(String[ ] arg)
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
        {
            case  'a' :
            case 'e'  :
            case 'i'   :
            case 'o'  :
            case 'u'  :
            case  'A' :
            case 'E'  :
            case 'I'   :
            case 'O'  :
            case 'U'  :i++;
        }
        if(i==1)
            System.out.println("Entered character "+ch+" is  Vowel");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }
}

class Char1
{
    public static void main(String[ ] arg)
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Entered character "+ch+" is  Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonant");
        else
            System.out.println("Not an alphabet");
    }
}

