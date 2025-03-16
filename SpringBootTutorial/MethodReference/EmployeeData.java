package SpringBootTutorial.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData
{
    public static List<Employee> populateEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Ujjwal", 40));
        employeeList.add(new Employee(177, "Sneha", 55));
        employeeList.add(new Employee(129, "Sudip", 60));
        employeeList.add(new Employee(101, "Ujjwal", 60));
        employeeList.add(new Employee(153, "Vikas", 44));
        employeeList.add(new Employee(102, "Tanishq", 47));
        employeeList.add(new Employee(105, "Prema", 51));
        return employeeList;
    }
}
