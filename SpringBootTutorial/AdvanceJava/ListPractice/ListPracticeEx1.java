package SpringBootTutorial.AdvanceJava.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPracticeEx1
{
        /*
        list with
        .add, .set , .remove , .size() , .addAll , .clear()
         */
    public static void main(String[] args)
    {
        System.out.println("Creating a List");
        List<String> list = new ArrayList<>();
        // for printing the list size
        System.out.println(list.size());
        // for adding data in list
        list.add("Ujjwal");
        list.add("Prem");
        list.add("Yasir");
        System.out.println(list.size());
        // for printing list
        System.out.println(list);
        // for adding list in between
        list.add(1,"Durgaram");
        list.add(4,"Ashik");
        list.add("Saksham");
        list.add("Harsh");
        System.out.println(list);
        // for removing the entry in list
        list.remove(5);
        System.out.println(list);
        // list always add data from last , check below
        list.add("Saksham");
        list.add("Sudip");
        list.add("Tanishq");
        System.out.println(list);
        // for getting the element of list at a index
        System.out.println(list.get(4));
        // modify element at a index in list
        list.set(7 , "Shivam");
        System.out.println(list);

        // for deleting all data in list
        list.clear();// it will delete all data in list
        System.out.println("Size of list is : "+list.size());
        System.out.println(list);
        //Creating new list
        // adding all data of list1 to list
        List<String> list1 = Arrays.asList("Ujjwal", "Durgaram", "Prem", "Yasir", "Ashik", "Harsh", "Saksham", "Sudip", "Tanishq");
        // use list.addAll to add all data from one list to another list
        list.addAll(list1);
        System.out.println(list);
        list.remove(8);
        list.remove(7);
        list.remove(6);
        System.out.println(list);
        // adding big data to list always add at last of the current list
        List<String> list2 = Arrays.asList("Saksham","Sudip","Tanishq");
        list.addAll(list2);
        System.out.println(list);
        // adding big data in list at a index
        List<String> list3 = Arrays.asList("Sneha","Tanya");
        list.addAll(1,list3);
        System.out.println(list);
        // for sorting elements using collections
        // it will sort based on the ascii values
        Collections.sort(list);
        System.out.println(list);

    }
}
