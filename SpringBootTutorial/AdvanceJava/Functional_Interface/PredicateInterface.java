package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.Predicate;

public class PredicateInterface
{
    public static void main(String[] args)
    {
        // takes one input , verifies condition
        // return true or false based on the result of the condition
        Predicate<Integer> divisbleNum = num -> num%2==0;
        System.out.println("Checking for 30 : "+divisbleNum.test(30));
        System.out.println("Checking for 15 : "+divisbleNum.test(15));
    }
}
