package SpringBootTutorial;

import java.util.Scanner;

class SumSub
{
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}
//MulDiv class is inheriting SumSub class
class MulDiv extends SumSub
{
    public int mul(int num1 , int num2)
    {
        return num1*num2;
    }
    public int div(int num1 , int num2)
    {
        return num1 / num2 ;
    }
}
// Power class is inheriting Muldiv class as well as SumSub class also
class Power extends MulDiv
{
    public double power(int num1 , int num2)
    {
        return Math.pow(num1,num2);
    }
}
public class MathsInheritSumandSub
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        Power obj = new Power();
        System.out.println("Sum of "+num1+ " & "+ num2+ " is "+ obj.add(num1 , num2));
        System.out.println("Sub of "+num1+ " & "+ num2+ " is "+ obj.sub(num1 , num2));
        System.out.println("Mul of "+num1+ " & "+ num2+ " is "+ obj.mul(num1 , num2));
        System.out.println("Div of "+num1+ " & "+ num2+ " is "+ obj.div(num1 , num2));
        System.out.println("Power of "+num1+ " & "+ num2+ " is "+ obj.power(num1 , num2));
    }
}

