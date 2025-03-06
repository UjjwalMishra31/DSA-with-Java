package SpringBootTutorial.DSA.Patterns_Java;

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
           // System.out.print("*");
            for (int j = 1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
