package Arrays_Java;
import java.util.Scanner;
public class TransposeMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter matrix elements one by one : ");
        for (int i = 0 ; i<row ; i++)
        {
            for (int j = 0; j<column; j++)
            {
                matrix[i][j] =sc.nextInt();
            }
        }
        // Transpose of matrix
        for (int j = 0 ; j<column ; j++)
        {
            for (int i = 0 ; i<row ; i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
