package SpringBootTutorial.AdvanceJava.ListPractice;

import java.util.Arrays;
import java.util.List;

public class ListModificationandBacking
{
    // list is backed by array & Unmodifiable list
    public static void main(String[] args)
    {
        String[] array = {"Ujjwal" , "Sudip" , "Vikas" , "Sneha" , "Tanishq"};
        List<String> list = Arrays.asList(array);
        System.out.println("Here , List is backed by array.");
        System.out.println();
        System.out.println("Elements of list : "+list);
        for (String arr : array)
        {
            System.out.println("Element of array is : "+arr);
        }
        /*
        Now You cannot add,remove any element from the list
        as it is backed by array ,
        instead you can just update it
         */
        /*
        if you modify list, array will get modified
        if you modify array , list will get modified
         */
        // list modification
        list.set(1,"Shiv");
        System.out.println();
        System.out.println("Sudip got changed to Shiv in array when list was modified");
        System.out.println("Elements of list : "+list);
        for (String arr : array)
        {
            System.out.println("Element of array is : "+arr);
        }
        // now, modifing array
        array[1] = "Sudip";
        System.out.println();
        System.out.println("Shiv got changed backed to Sudip in list when array was modified");
        System.out.println("Elements of list : "+list);
        for (String arr : array)
        {
            System.out.println("Element of array is : "+arr);
        }

        /*
        UnModifiable List
        cannot remove,add,set , clear or anything
         */
        List<String> list1 = List.of("Ujjwal", "Sudip ", "Sneha"); // cannot modify this list
        System.out.println("Unmodifiable list : "+list1.size());
        System.out.println("Unmodifiable list Items are :"+list1);
        //list1.set(1,"Vikas");

    }
}
