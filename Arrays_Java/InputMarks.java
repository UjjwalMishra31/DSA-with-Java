package Arrays_Java;

import java.util.Scanner;

public class InputMarks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Please Enter marks");
        for (int i = 0 ; i<size ; i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.println("Mathematics Marks : "+marks[0]);
        System.out.println("Physics Marks : "+marks[1]);
        System.out.println("Chemistry Marks : "+marks[2]);
        System.out.println("English Marks : "+marks[3]);
        System.out.println("Sanskrit Marks : "+marks[4]);

    }
}
