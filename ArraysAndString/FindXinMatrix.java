package ArraysAndString;

import java.util.Scanner;

public class FindXinMatrix
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter array's values one by one : ");
        for (int i = 0; i<row; i++)
        {
            for (int j = 0; j<column ; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value which you want to find in the array : ");
        int x  = sc.nextInt();
        // loop for finding x in array
        for (int i = 0 ; i<row; i++)
        {
            for (int j = 0 ; j<column ; j++)
            {
                if( array[i][j] == x) {
                    System.out.println("The location was ("+i+","+j+")");
                    break;
                }
            }
        }
    }
}
