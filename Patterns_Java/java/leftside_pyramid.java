package Patterns_Java.java;

public class leftside_pyramid
{
    public static void main(String[] args)
    {
        int n = 4;
        for (int i=1 ; i<=4 ; i++)
        {//1st loop for space
            for (int j = 1; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            // 2nd loop for *
            for (int j = 1; j<=i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println("\n");

        }
    }
}
