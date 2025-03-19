package SpringBootTutorial.AdvanceJava.StreamAPI.ParallelStream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataClass
{
    public static List<EmployeeClass> populateStreamEmployees() {
        List<EmployeeClass> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeClass(101, "Ujjwal", 40));
        employeeList.add(new EmployeeClass(177, "Sneha", 55));
        employeeList.add(new EmployeeClass(129, "Sudip", 60));
        employeeList.add(new EmployeeClass(101, "Ujjwal", 60));
        employeeList.add(new EmployeeClass(153, "Vikas", 44));
        employeeList.add(new EmployeeClass(102, "Tanishq", 47));
        employeeList.add(new EmployeeClass(105, "Prema", 35));
        return employeeList;
    }
}
