package SpringBootTutorial.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicDemo
{
    public static void main(String[] args)
    {
        List<Employee> employeeList = EmployeeData.populateEmployees();
        // forEach method in place of adv for loop and
        // sout statement with the use of method reference with forEach
        employeeList.forEach(System.out::println);

        //print filtered list with those whose age is >=50
        System.out.println();
        System.out.println("Printing Filtered List");
        System.out.println();
        List<Employee> filterList = new ArrayList<>();
        for (Employee emp : employeeList)
        {
            if (emp.getAge() >= 45)
            {
                filterList.add(emp);
            }
        }

        // printing the emp with name in sequence using comparator

        Collections.sort(filterList, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee filteremp : filterList)
        {
            System.out.println(filteremp);
        }
    }
}
