package SpringBootTutorial.Tutorial_CoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachwithStreamApi
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,1,10,9,4,8,3,7);
        // forEach is used for printing the values one by one
        nums.forEach(n -> System.out.println(n));
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));
        // you cannot reuse the same straem
        // s1.forEach(n -> System.out.println(n)); it will give error
        // Stream api
        int number = nums.stream()
                .filter(n-> n%2==0) // filter out all odd values
                .map(n -> n*2) // it will double all even values
                .reduce(0, (c,e) -> (c+e)); // it will add all doubled even values
        System.out.println(number);
    }
}
