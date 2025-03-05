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
        List<String>  item3 = Arrays.asList("Ujjwal","Sudip","Vikas","Sneha","Tanishq");

        System.out.println("Printing only Integer");
        ReadItem1(item);
        //ReadItem1(item1);  not possible as integer does not support double
        //ReadItem1(item2);  does not support Number also


        System.out.println("Printing child class with Parent");
        ReadItem2(item);
        //ReadItem2(item1); // not support double
        ReadItem2(item2); // support Number as it is the parent


        System.out.println("Printing wrapper class with parent class");
        ReadItem3(item);
        ReadItem3(item1);
        ReadItem3(item2);

        System.out.println("Printing all with just Wildcard");
        // ? - it will support all type of values in generics
        ReadItem4(item);
        ReadItem4(item1);
        ReadItem4(item2);
        ReadItem4(item3);
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
    public static void ReadItem4(List<?> list)
    {
        System.out.println(list);
    }

}
