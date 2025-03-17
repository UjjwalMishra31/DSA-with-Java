package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapFlatMap
{
    public static void main(String[] args)
    {
        List<NewEmployee> emplist = EmployeeData2.populateStreamEmployees();
        List<NewEmployee> emplist2 = EmployeeData2.populateStreamEmployees2();

        // use this for printing the names only of a list
        // use map for printing only one data
        System.out.println("Printing name of List-1");
        emplist.stream()
                .map(NewEmployee::getName)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Printing name of List-2");
        emplist2.stream()
                .map(NewEmployee::getName)
                .forEach(System.out::println);
        System.out.println();
        // use flapmap for printing the same type of data of two or more lists
        System.out.println("Printing names of List-1 & List-2 Together");
        Stream<List<NewEmployee>> stream = Stream.of(emplist,emplist2);
        stream.flatMap(Collection::stream) // can also use .flatMap(emp -> emp.stream())
                .map(NewEmployee::getName) // can also use .map(emp -> emp.getname())
                .forEach(System.out::println);

    }
}
