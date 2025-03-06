package SpringBootTutorial.DSA.Patterns_Java;
import java.util.*;
public class pascal_traingle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Input number of rows
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Generate Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            // Calculate and print Pascal's Triangle values
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // Calculate the next value
            }
            System.out.println();
        }
        scanner.close();
    }
}