package Loop;

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
