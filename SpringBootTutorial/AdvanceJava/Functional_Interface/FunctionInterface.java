package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.Function;

public class FunctionInterface
{
    public static void main(String[] args)
    {
        // takes one input and returns one output
        // we will use functional interface
        // to increment a given number by one
        Function<Integer,Integer> FunctionOutput = num -> ++num ;
        System.out.println(FunctionOutput.apply(19));
    }
}
