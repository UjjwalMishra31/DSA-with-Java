package SpringBootTutorial.Tutorial_CoreJava;
// final - variable , method , class
// final variable : cannot update the value of a variable declared using final
// final class :  cannot inherit the class declared using final
// none of the child class can inherit newcal class
// final method : it is used to prevent method overriding
final class newcal
{
    public int sum(int num1, int num2)
    {
        return num1+num2;
    }
    public int sub(int num1 , int num2)
    {
        return num1 - num2;
    }
}
public class FinalKeyword
{
    public static void main(String[] args) {
        final int n = 10;
        // cannot update the value of n
        // cannot do so { n = 11; }
    }
}
