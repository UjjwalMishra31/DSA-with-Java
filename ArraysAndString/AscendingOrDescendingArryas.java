package ArraysAndString;

import java.util.Scanner;

public class AscendingOrDescendingArryas
{
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size  = sc.nextInt();
        System.out.println("Enter numbers one by one : ");
        int[] num = new int[size];
        for (int i = 0; i<size; i++)
        {
            num[i] = sc.nextInt();
        }
        boolean IsAscending = true; // array is in ascending order
        for (int i = 0 ; i< num.length - 1; i++)
        {
            if (num[i]> num[i+1])
            {
                IsAscending = false;
            }
        }
        if (IsAscending)
        {
            System.out.println("Array is in Ascending order.");
        }
        else {
            System.out.println("Array is in Descending order.");
        }
    }
}
