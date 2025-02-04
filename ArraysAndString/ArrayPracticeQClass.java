package ArraysAndString;
import java.util.Scanner;
public class ArrayPracticeQClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       // int number = sc.nextInt();
        int arr[] = {6, 7, 8, 9, 2, 3};
        // 6 = 0
        // 7 = 1
        // 8 = 2
        // 9 = 3
        // 2 = 4
        // 3 = 5
        int n = arr.length;
        int brr[] = new int[6];
        int idx = 0;
        //System.out.println(n);
        for (int i = n - 1; i >= 3 ; i--) {
            brr[idx] = arr[n - 1];
            idx++;
            n--;
        }
        //int count = number ;
        int count = 3;
        for (int i = 0; i <3; i++) {
            brr[count] = arr[i];
            count++;

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}