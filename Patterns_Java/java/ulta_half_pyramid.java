package Patterns_Java.java;

public class ulta_half_pyramid
{
    public static void main(String[] args)
    {
//    {
//        for (int i = 4;i>=1;i--)
//        {
//            for (int j = i; j>= 1;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        for (int i = 4;i>=1;i--)
    {
        for (int j = 1; j<=i ;j++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
    }
    }
}
