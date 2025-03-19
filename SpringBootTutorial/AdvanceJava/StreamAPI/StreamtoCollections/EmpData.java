package SpringBootTutorial.AdvanceJava.StreamAPI.StreamtoCollections;

import SpringBootTutorial.AdvanceJava.StreamAPI.NewEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmpData
{
    public static List<StreamEmployee> populateStreamEmployees() {
        List<StreamEmployee> employeeList = new ArrayList<>();
        employeeList.add(new StreamEmployee(101, "Ujjwal", 40));
        employeeList.add(new StreamEmployee(177, "Sneha", 55));
        employeeList.add(new StreamEmployee(129, "Sudip", 60));
        employeeList.add(new StreamEmployee(101, "Ujjwal", 60));
        employeeList.add(new StreamEmployee(153, "Vikas", 44));
        employeeList.add(new StreamEmployee(102, "Tanishq", 47));
        employeeList.add(new StreamEmployee(105, "Prema", 35));
        return employeeList;
    }
}
