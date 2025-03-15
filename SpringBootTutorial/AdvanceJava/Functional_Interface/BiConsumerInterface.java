package SpringBootTutorial.AdvanceJava.Functional_Interface;

import java.util.function.BiConsumer;

public class BiConsumerInterface
{
    public static void main(String[] args)
    {
        // accepts two input but returns nothing
        BiConsumer<String,Integer> printmessage = (name,age) ->System.out.println("Hii! "+name+" your age is : "+age);
        printmessage.accept("Ujjwal" , 21);
    }
}
