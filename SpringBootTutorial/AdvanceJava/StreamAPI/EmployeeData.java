package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData
{
    public static List<NewEmployee> populateStreamEmployees() {
        List<NewEmployee> employeeList = new ArrayList<>();
        employeeList.add(new NewEmployee(101, "Ujjwal", 40));
        employeeList.add(new NewEmployee(177, "Sneha", 55));
        employeeList.add(new NewEmployee(129, "Sudip", 60));
        employeeList.add(new NewEmployee(101, "Ujjwal", 60));
        employeeList.add(new NewEmployee(153, "Vikas", 44));
        employeeList.add(new NewEmployee(102, "Tanishq", 47));
        employeeList.add(new NewEmployee(105, "Prema", 51));
        return employeeList;
    }
}
