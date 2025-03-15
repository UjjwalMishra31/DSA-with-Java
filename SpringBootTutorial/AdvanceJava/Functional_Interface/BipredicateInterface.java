package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.BiPredicate;

public class BipredicateInterface
{
    public static void main(String[] args)
    {
        // takes two input , gives the output as per the condition
        // returns true when length of string is greater than 3
        BiPredicate<String, Integer> isLengthGreaterThan = (str, len) -> str.length() > len;
        System.out.println("Checking the condition for String [ Hello ] & Number : 3 ");
        System.out.println(isLengthGreaterThan.test("Hello", 3));
        System.out.println("Checking the condition for String [ Hi ] & Number : 3 ");
        System.out.println(isLengthGreaterThan.test("Hi", 3));
    }
}
