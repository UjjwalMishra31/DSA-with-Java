package SpringBootTutorial.Tutorial_CoreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInetrfaceArray
{
    public static void main(String[] args)
    {
        Collection<Integer> numsum = new ArrayList<Integer>();
        // collection store values as objects not int so use Integer
        //  Collection numsum = new ArrayList(); {check above line}
        numsum.add(10);
        numsum.add(11);
        numsum.add(10);
        numsum.add(20);
        // you can directly print the collection
        System.out.println(numsum);
        // printing collections one by one
        for (int num : numsum)
        {
            System.out.println(num);
        }
        // USing list instead of collections
        // list support multiple similar data
        List<Integer> numsum1= new ArrayList<>();
        numsum1.add(10);
        numsum1.add(11);
        numsum1.add(10);
        numsum1.add(20);
        // getting index of element in list [element 20 at index 3]
        System.out.println(numsum1.indexOf(20));
        // getting element at the index [index 3 element 20]
        System.out.println(numsum1.get(3));

        for (Integer list : numsum1)
        {
            System.out.println(list);
        }
    }
}
