package Patterns_Java.java;

public class bounday_patterns
{
    public static void main(String[] args)
    {
         //     *****
         //     *   *
         //     *   *
         //     *****
        int m = 4;
        int n = 5;
        for (int i = 1 ; i<=4 ; i++ )
        {
            for (int j = 1 ; j<=5 ; j++ )
            {
                if (i==1||i==4||j==1||j==5)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
