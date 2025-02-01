package ArraysAndString;

import java.util.Scanner;

public class StringWithArrayLength
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row= sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int column = sc.nextInt();
        String[][] array = new String[row][column];
        int length = 0;
        System.out.println("Enter the values of Array one by one : ");
        for (int i = 0 ; i<row ; i++)
        {
            for (int j = 0 ; j<column ; j++)
            {
                array[i][j] = sc.next();
                length = length + 1;
            }
        }
        System.out.println("The length of the String is : "+length);

    }
}
