package Patterns_Java.java;

public class descending_order_number_pattern
{
    public static void main(String[] args)
    {
        //int num = 10 ;
        for (int i = 5 ; i>=1 ; i--)
        {
            for (int j = i ; j>=1 ; j-- )
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }

    }
}
