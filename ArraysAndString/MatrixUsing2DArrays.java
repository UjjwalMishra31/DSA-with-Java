package ArraysAndString;

import java.util.Scanner;

public class MatrixUsing2DArrays
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for array : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns for array : ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter values of matrix one by one : ");
        for (int i = 0; i<row;i++)
        {
            for (int j = 0; j<column; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array in Matrix form : ");
        for (int i = 0 ; i<row ; i++)
        {
            for (int j = 0 ; j<column; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
