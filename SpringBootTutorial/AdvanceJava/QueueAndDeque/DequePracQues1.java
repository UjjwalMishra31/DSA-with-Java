package SpringBootTutorial.AdvanceJava.QueueAndDeque;

import java.util.*;

public class DequePracQues1
{
    public static void main(String[] args) {
          /*
        Creating a Deque
         */
        Deque<String> deque = new LinkedList<>();
        // adding data in queue
        deque.add("Ujjwal");
        deque.add("Sudip");
        deque.add("Tanishq");
        deque.offer("Sneha"); //  used for adding elements in deque with limits
        deque.offer("Prema");
        System.out.println("Elements of Deque are : "+ deque);
        // removing element from deque
        deque.remove();// always remove first item
        deque.remove("Sneha");
        deque.remove();
        System.out.println(deque);
        // printing the size of the deque
        System.out.println(deque.size());
        /*
        Special Features of Deque
         */
        deque.add("Ujjwal");
        deque.addFirst("Sneha");
        deque.offerFirst("Sudip");
        deque.offerLast("Tanishq");
        deque.addLast("Prem");
        System.out.println("Size of deque : "+deque.size());
        System.out.println("Elements of Deque are : "+deque);
        System.out.println("Using deque.getFirst : "+deque.getFirst());
        System.out.println("Using deque.peekFirst : "+deque.peekFirst());
        System.out.println("using deque.peek : "+deque.peek());
        System.out.println("Using deque.element : "+deque.element());
        System.out.println("using deque.peekLast() : "+deque.peekLast());
        System.out.println("Using deque.getLast() : "+deque.getLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        deque.poll();
        deque.pollFirst();
        System.out.println(deque);
        deque.add("Ujjwal");
        deque.add("Prem");
        System.out.println("adding new elements again : "+deque);
        deque.pollLast();
        System.out.println(deque);


        /*
        creating list and adding it in deque
         */
        List<String> list = Arrays.asList("Ujjwal" , "Vikas " , "Sneha");
        deque.addAll(list); // adding list data in deque
        System.out.println(deque);

        // for removing all the data from queue
        deque.clear();
        System.out.println("After using clear() in Deque, Size of queue : "+deque.size());
        System.out.println("Printing the available data in Deque : "+deque);

    }
}
