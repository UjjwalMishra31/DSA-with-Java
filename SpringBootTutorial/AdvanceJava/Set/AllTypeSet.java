package SpringBootTutorial.AdvanceJava.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllTypeSet
{
    /*
       HashSet          : unsorted manner output [ random ]
       LinkedHashSet    : sorted manner output [ based on the sequence in which element was added ]
       TreeSet          : sorted manner [based on ASCII values]
     */
    public static void main(String[] args)
    {
        /*
        Prints all values but in random order , not in a sequence
         */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("is");
        hashSet.add("good");
        hashSet.add("You");
        hashSet.add("should");
        hashSet.add("learn");
        hashSet.add("this");
        System.out.println("Contents of HashSet are: " + hashSet);

        /*
        Links all elements with each other , and prints in the sequence in which it was added
         */
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("is");
        linkedHashSet.add("good");
        linkedHashSet.add("You");
        linkedHashSet.add("should");
        linkedHashSet.add("learn");
        linkedHashSet.add("this");
        System.out.println("Contents of LinkedHashSet are: " + linkedHashSet);

        /*
        Always prints in the sorted manner based on the ASCII values
         */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("is");
        treeSet.add("good");
        treeSet.add("You");
        treeSet.add("should");
        treeSet.add("learn");
        treeSet.add("this");
        System.out.println("Contents of TreeSet are: " + treeSet);
    }
}
