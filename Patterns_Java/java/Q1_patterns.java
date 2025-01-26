package Patterns_Java.java;

public class Q1_patterns
{
    public static void main(String[] args)
    {//print patterns in format   *****
        //                        *****
        //                        *****
        //                        *****
        //                        *****
        for (int i = 1;i<=5;i++)
        {
            System.out.println("*");
            for (int j = 1;j<=4;j++)
            {
                System.out.print("*");
            }
        }
    }
}
