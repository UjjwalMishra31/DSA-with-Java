package Functions;

import java.util.Scanner;

public class IsEven
{
    public static int even(int num)
    {
        if (num%2==0)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        even(num1);
    }
}
