package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData2
{
    public static List<NewEmployee> populateStreamEmployees() {
        List<NewEmployee> employeeList = new ArrayList<>();
        employeeList.add(new NewEmployee(101, "Ujjwal", 40));
        employeeList.add(new NewEmployee(177, "Sneha", 55));
        employeeList.add(new NewEmployee(129, "Sudip", 60));
        employeeList.add(new NewEmployee(101, "Ujjwal", 60));
        employeeList.add(new NewEmployee(153, "Vikas", 44));
        employeeList.add(new NewEmployee(102, "Tanishq", 47));
        employeeList.add(new NewEmployee(105, "Prema", 35));
        return employeeList;
    }
    public static List<NewEmployee> populateStreamEmployees2() {
        List<NewEmployee> employeeList = new ArrayList<>();
        employeeList.add(new NewEmployee(112, "Krishna", 41));
        employeeList.add(new NewEmployee(173, "Sneh", 52));
        employeeList.add(new NewEmployee(120, "Sundar", 62));
        employeeList.add(new NewEmployee(111, "Durga", 63));
        employeeList.add(new NewEmployee(151, "Yasir", 47));
        employeeList.add(new NewEmployee(108, "Tanya", 48));
        employeeList.add(new NewEmployee(106, "Prerna", 59));
        return employeeList;
    }
}
