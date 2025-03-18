package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.List;

public class Demo2_Peek_Matching
{
    public static void main(String[] args)
    {
        List<NewEmployee> list = EmployeeData2.populateStreamEmployees();
        // using peek to find number of entries in this list [ no. of employees ]
        System.out.println("Printing only no. of employees");
        long count = list.stream()
                .count();
        System.out.println(count);
        System.out.println();
        // using peek now
        // this will print count only but not employees
        System.out.println("Printing the no. of employees using peek");
        long count2 = list.stream()
                .peek(System.out::println)
                .count();
        System.out.println(count2);
        System.out.println();
        // printing all employees also using peek
        // modification of above code
        System.out.println("Printing no. of employees as well as the data also with count using peek");
        System.out.println();
        long count3 = list.stream()
                .peek(System.out::println)
                .filter(emp -> emp.getAge() > 0)
                .count();
        System.out.println(count3);

        /*
        using matching
        allMatch
        anyMatch
        noneMatch
         */
        System.out.println("Using allMatch");
        boolean match = list.stream().allMatch(emp -> emp.getAge() > 40);
        // if all emp age > 40 then true else false
        System.out.println(match);
        System.out.println();

        System.out.println("Using anyMatch");
        boolean match2 = list.stream().anyMatch(emp -> emp.getAge() > 40);
        // if any emp age > 40 then true else false
        System.out.println(match2);
        System.out.println();

        System.out.println("Using noneMatch");
        boolean match3 = list.stream().noneMatch(emp -> emp.getAge() > 40);
        // prints true if all emp age > 40 else false
        System.out.println(match3);
    }
}
