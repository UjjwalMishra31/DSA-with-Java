package Functions;

import java.util.Scanner;

public class IsPrime
{
    public static int prime(int num)
    {
        boolean isprime = false;
        if (num==1)
        {
            System.out.println("Neither prime nor composite");
            return 0;
        }
        for (int i = 2; i <= num/2 ; i++)
        {
            if (num%i==0)
            {
                isprime = true;
                break;
            }
        }
        if (isprime == true)
        {
            System.out.println("Composite Number");
        }
        else {
            System.out.println("Prime number");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int primemum = sc.nextInt();
        prime(primemum);
    }
}
