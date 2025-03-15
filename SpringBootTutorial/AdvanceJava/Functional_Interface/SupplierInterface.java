package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.Supplier;

public class SupplierInterface
{
    public static void main(String[] args)
    {
        // takes no input but returns a result
        Supplier<String> supplier = () -> "Hello, Supplier!";

        System.out.println(supplier.get()); // Output: Hello, Supplier!
    }
}
