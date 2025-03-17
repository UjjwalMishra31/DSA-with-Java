package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.List;

public class MainDemo
{
    public static void main(String[] args)
    {
        List<NewEmployee> StreamMainList = EmployeeData.populateStreamEmployees();
        System.out.println("Printing Main List without Changes.");
        System.out.println("----INPUT DATA----");
        StreamMainList.forEach(System.out::println);
        System.out.println();
        System.out.println("----OUTPUT DATA----");
        System.out.println("----STREAM_LIST----");
        // converting stream list to stream
            // only printing whose age is greater than 45
        StreamMainList.stream()
                .filter(newEmployee -> newEmployee.getAge() >= 45)
                .sorted(((o1, o2) -> o1.getName().compareTo(o2.getName())))
                .forEach(System.out::println);

    }
}
