package SpringBootTutorial.AdvanceJava.Set;

import java.lang.reflect.Array;
import java.util.*;

public class SetHashsetPrac1
{
    public static void main(String[] args)
    {
        // creating a new set
        Set<String> set = new HashSet<>();
        // adding values to the set
        set.add("Ujjwal");
        set.add("Tanishq");
        set.add("Sudip");
        set.add("Sneha");
        // printing values of set
        System.out.println(set);
        System.out.println("Using set.size() : "+set.size());
        set.remove("Sudip");
        System.out.println("using set.remove(Sudip) : "+set);
        set.clear();
        System.out.println("Clearing the set : " + set);
        // checking if the set is empty
        System.out.println("Check if set is empty");
        if (set.isEmpty())
        {
            System.out.println("Set is empty");
        }
        /*
        Adding elements to set using list
         */
        List<String> list = Arrays.asList("Ujjwal", "Sudip","Sneha" , "Tanishq");
        /*
        cannot use set.add(list);
         */
        set.addAll(list);
        System.out.println("Added elements from list are : "+ set);

        /*
        Again adding new values to set using another list
         */
        List<String> list2 = Arrays.asList("Prem", "Yasir", "Durga");
        set.addAll(list2);
        System.out.println("Recently updated set is : "+set);

        /*
        For Sorting the set
        directly not possible and add the values of set to list then sort
         */
        List<String> list3 = new ArrayList<>(set);
        System.out.println("List3 before sorting is : "+list3);
        Collections.sort(list3);
        System.out.println("List3 after sorting is : "+list3);
    }
}
