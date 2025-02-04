package SpringBootTutorial;

public class WrapperClass
{
    public static void main(String[] args)
    {
        int num = 10;
        Integer num1 = num;     // auto-boxing
        // automatically alloting num values to num1

        int num2 = num1;        // auto-unboxing
        // automatically alloting num1 value to num2

        // String to int conversion
        String str = "12";
        // used to convert String to int type
        int num3 = Integer.parseInt(str);
        System.out.println(num3*3);
    }
}
