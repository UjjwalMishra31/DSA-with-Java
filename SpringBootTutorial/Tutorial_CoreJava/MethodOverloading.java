package SpringBootTutorial.Tutorial_CoreJava;

import java.util.Scanner;
class NewCalculator
{
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int sub(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        NewCalculator cal = new NewCalculator();
        NewCalculator cal1 = new NewCalculator();
        System.out.println("Sum of three numbers is : "+cal.add(num1,num2,5));
        System.out.println("Sum of the two numbers is : " + cal.add(num1, num2));
        System.out.println("Sub of two numbers is : " + cal.sub(num1, num2));
    }
}
