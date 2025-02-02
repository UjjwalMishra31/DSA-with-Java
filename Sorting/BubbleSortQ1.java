package Sorting;

import java.util.Scanner;

public class BubbleSortQ1
{
    public static void BubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0 ; i<n-1 ; i++)
        {
            for (int j = 0 ; j<n-1-i ; j++)
            {
                if (arr[j] > arr[j+1]) {
                    int tempvar = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempvar;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,10,13,16,12,11};
        BubbleSort(arr);
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
