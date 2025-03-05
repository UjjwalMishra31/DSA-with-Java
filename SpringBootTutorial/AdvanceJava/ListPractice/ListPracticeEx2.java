package SpringBootTutorial.AdvanceJava.ListPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeEx2
{       /*
        using list with integers for removing values
        */
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);
        // while you want to remove the data from list , if it is a integer always use Integer.
        numbers.remove(1);   // index 1 is taken
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));// element 1 is taken
        System.out.println(numbers);
    }
}
