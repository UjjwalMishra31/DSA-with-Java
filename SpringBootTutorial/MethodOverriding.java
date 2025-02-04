package SpringBootTutorial;
class cal
{
    public int sum(int num1, int num2)
    {
        return num1 + num2;
    }
}
class Advcal extends cal
{
    public int sum(int num1 , int num2)
    {
        return num1 + num2 + 1;
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        Advcal obj = new Advcal();
        System.out.println("Sum of the two numers is while adding 1 extra is : "+obj.sum(10,10));
    }
}
