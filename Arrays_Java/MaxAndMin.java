package Arrays_Java;

import java.util.Scanner;

public class MaxAndMin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter numbers one by one : ");
        for (int i = 0 ; i<size ; i++)
        {
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i<num.length ; i++)
        {
            if (num[i] < min)
            {
                min = num[i];
            }
            if (num[i] > max)
            {
                max = num[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
    }
}
