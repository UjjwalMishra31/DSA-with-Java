package Functions;

import java.util.Scanner;

public class Table
{
    public static int table(int num)
    {
        for (int i = 1 ; i<=10 ; i++)
        {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        table(num);
    }
}
