package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.List;
import java.util.Optional;

public class Demo4_findFirst_findAny
{
    public static void main(String[] args)
    {
        List<NewEmployee> employeeList = EmployeeData2.populateStreamEmployees();
        System.out.println("---FIND FIRST---");
        // Get the first employee
        // Print the employee
        Optional<NewEmployee> optional1 = employeeList.stream().findFirst();
        System.out.println(optional1);

        System.out.println("---FIND ANY---");
        // Create a stream from given list
        // Get any random employee
        // Print the employee
        Optional<NewEmployee> optional2 = employeeList.stream().findAny();
        System.out.println(optional2);
    }
}
