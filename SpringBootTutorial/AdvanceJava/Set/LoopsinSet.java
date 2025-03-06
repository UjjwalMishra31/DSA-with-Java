package SpringBootTutorial.AdvanceJava.Set;

import java.util.*;

public class LoopsinSet
{
    public static void main(String[] args)
    {
        /*
        Loops cannot be directly used in set
        special conditions are required as there is no index values present
         */
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"Ujjwal","Sudip" ,"Tanishq", "Prema","Yasir", "Vikas");
        System.out.println("---enhanced for loop---");
        for (String element : set)
            System.out.println("Value of element is: " + element);

        System.out.println("---using iterator---");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println("Value of element is: " + iterator.next());
    }
}
