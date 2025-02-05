package SpringBootTutorial.Tutorial_CoreJava;

import java.util.Scanner;

class calculator
{
    public int add(int n1, int n2)
    {
        int result = n1 + n2;
        return result;
    }
    public int sub(int n1,int n2)
    {
        int result = n1 - n2;
        return result;
    }
}

public class ObjectOutsideClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        calculator cal = new calculator();
        System.out.println("Sum of the two numbers is : "+cal.add(num1,num2));
        System.out.println("Sub of two numbers is : "+cal.sub(num1,num2));
    }
}
