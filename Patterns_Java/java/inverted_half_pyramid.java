package Patterns_Java.java;

public class inverted_half_pyramid
{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i<=4 ; i++)
        {
            for (int j = i; j<=n ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
