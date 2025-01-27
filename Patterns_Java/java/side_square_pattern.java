package Patterns_Java.java;

public class side_square_pattern
{
    public static void main(String[] args)
    {
        int n = 4;
        for (int i = 1; i<=n; i++)
        {// for spaces
            for (int j = 1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            // for stars
            for (int j = i;j>=1;j--)
            {
                System.out.print("*");
            }
            for (int j = 2; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // down loop
        for (int i = n; i>=1; i--)
        {// for spaces
            for (int j = 1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            // for stars
            for (int j = i;j>=1;j--)
            {
                System.out.print("*");
            }
            for (int j = 2; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
