package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.Consumer;

public class ConsumerInterface
{
    public static void main(String[] args)
    {
        // accepts single input , returns nothing
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, World!");  // Output: Hello, World!
    }
}
