package ArraysAndString;

import java.util.Scanner;

public class InputNames
{
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("How many names you want to enter : ");
        int size = sc.nextInt();
        String[] name = new String[size];
        System.out.println("Enter names one by one : ");
        for (int i = 0 ; i<size ; i++)
        {
            name[i] = sc.next();
        }
        for (int i = 0 ; i<size ; i++)
        {
            System.out.println("Name is : "+name[i]);
        }
    }
}
