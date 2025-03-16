package SpringBootTutorial.AdvanceJava.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2
{
    public static void main(String[] args)
    {
        // printing with comparator using lambda experssion

        List<Employee> employeeList = EmployeeData.populateEmployees();
        // forEach method in place of adv for loop and
        // sout statement with the use of method reference with forEach
        employeeList.forEach(System.out::println);

        //print filtered list with those whose age is >=45
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
        // now using comparator with lambda expression

        Collections.sort(filterList, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        // printing with forEach method

        filterList.forEach(System.out::println);
    }
}
