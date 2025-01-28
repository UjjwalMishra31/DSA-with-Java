package Functions;

import java.util.Scanner;

public class FactorialNumber
{
    public static int fact(int a)
    {
        int fact = 1;
        for (int i = a ; i>= 1 ; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is : "+fact);
        return 1;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int a = sc.nextInt();
        fact(a);

    }
}
