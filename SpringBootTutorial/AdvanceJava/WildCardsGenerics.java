package SpringBootTutorial.AdvanceJava;

import java.util.Arrays;
import java.util.List;

public class WildCardsGenerics
{
    public static void main(String[] args)
    {
        List<Integer> item = Arrays.asList(10,20,30,50);
        List<Double>  item1 = Arrays.asList(20.2,30.0,66.6,78.9);
        List<Number>  item2 = Arrays.asList(20,20.7,40.8,90);

        System.out.println("Printing only Integer");
        ReadItem1(item);

        System.out.println("Printing child class with Parent");
        ReadItem2(item);
        //ReadItem2(item1);

        System.out.println("Printing wrapper class with parent class");
        ReadItem3(item);
        ReadItem3(item1);
        ReadItem3(item2);
    }
    public static void ReadItem1(List<Integer> list)
    {
        System.out.println(list);
    }
    public static void ReadItem2(List<? super Integer> list)
    {
        System.out.println(list);
    }
    public static void ReadItem3(List<? extends Number> list)
    {
        System.out.println(list);
    }

}
