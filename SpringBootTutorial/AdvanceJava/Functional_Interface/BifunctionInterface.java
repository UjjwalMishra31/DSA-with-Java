package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.BiFunction;

public class BifunctionInterface
{
    public static void main(String[] args)
    {
        // takes two input , returns one output
        BiFunction<Integer,Integer,Integer> div = (num1, num2) -> num1/num2;
        System.out.println("When divided by 10 & 5 , Output : "+div.apply(10,5));
        System.out.println("When divided by 10 & 3 , Output : "+div.apply(10,3));
    }
}
