package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.Comparator;
import java.util.List;

public class Demo1
{
    public static void main(String[] args)
    {
        // skip, limit, sort,

        List<NewEmployee> demolist = EmployeeData2.populateStreamEmployees();
        demolist.forEach(System.out::println);

        System.out.println("--SKIP--");
        // skips top two lines
        demolist.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("--LIMIT--");
        // only prints the of n elements
        demolist.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--Sorting--");
        // first implement comparable for sorting on the basis of age
        // then sort
        demolist.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("--Sorting In Reverse Order [IDS]--");
        // sorting ids in reverse order
        demolist.stream().sorted(Comparator.reverseOrder())
                        .forEach(System.out::println);

        System.out.println("---Sorting In Ascending order---");
        // sorting on the basis of age in ascending order
        demolist.stream()
                .sorted((o1,o2) -> o1.getAge() - o2.getAge())
                .forEach(System.out::println);

    }
}
