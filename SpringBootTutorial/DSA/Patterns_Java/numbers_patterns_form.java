package SpringBootTutorial.DSA.Patterns_Java;

import java.util.Scanner;

public class numbers_patterns_form
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = n; i < n+5; i++) {
            for (int j = n; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println("\n");
        }

    }
}
