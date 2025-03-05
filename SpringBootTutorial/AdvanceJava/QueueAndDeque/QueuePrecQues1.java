package SpringBootTutorial.AdvanceJava.QueueAndDeque;

import java.sql.Array;
import java.util.*;

public class QueuePrecQues1
{
    public static void main(String[] args)
    {
        /*
        Creating a queue
         */
        Queue<String> queue = new LinkedList<>();
        // adding data in queue
        queue.add("Ujjwal");
        queue.add("Sudip");
        queue.add("Tanishq");
        queue.offer("Sneha"); //  used for adding elements in queue with limits
        queue.offer("Prema");
        System.out.println("Elements of queue are : "+ queue);
        // removing element from queue
        queue.remove();// always remove first item
        queue.remove("Sneha");
        queue.remove();
        System.out.println(queue);
        // printing the size of the queue
        System.out.println(queue.size());
        // creating list with data
        List<String> list = Arrays.asList("Ujjwal" , "Vikas " , "Sneha");
        queue.addAll(list); // adding list data in queue
        System.out.println(queue);

        // for removing all the data from queue
        queue.clear();
        System.out.println("After using clear() in queue, Size of queue : "+queue.size());
        System.out.println("Printing the available data in queue : "+queue);

    }
}
