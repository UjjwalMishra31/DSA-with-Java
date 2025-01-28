package Functions;

import java.util.Scanner;

public class SumofTwoNumbers
{
    public static int sum(int a , int b )
    {
        int sum = a + b;
        System.out.println("Sum is : "+sum);
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        sum(a,b);
        //System.out.println("Sum is : "+sum(a,b));
    }
}
