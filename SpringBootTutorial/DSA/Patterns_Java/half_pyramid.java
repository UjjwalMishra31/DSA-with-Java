package SpringBootTutorial.DSA.Patterns_Java;

public class half_pyramid
{
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        for (int i = 1 ; i<=m ; i++ )
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
