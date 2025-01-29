package Functions;

import java.util.Scanner;

public class PrintAverage
{
    public static int avg(int a, int b, int c)
    {
        int avg = (a + b + c )/3;
        System.out.println("Average is : "+avg);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b, c;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();
        avg(a,b,c);
    }
}
