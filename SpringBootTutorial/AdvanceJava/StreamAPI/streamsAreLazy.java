package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.List;
import java.util.Optional;

public class streamsAreLazy
{
    public static void main(String[] args)
    {
        List<NewEmployee> emplist = EmployeeData2.populateStreamEmployees();

        // Create a stream from given list
        // Filter employees by marks more than equal to 60
        // Print the first filtered employee
        // Print employee before filtering, during filtering and after filtering
        Optional<NewEmployee> optional = emplist.stream()
                .peek(employee -> System.out.println("Pre Filtering : " + employee))
                .filter(employee -> {
                    System.out.println("Filtering : " + employee);
                    return employee.getAge() >= 50;
                })
                .peek(employee -> System.out.println("Post Filtering : " + employee))
                .findFirst();
        /*
        once stream will get the value of >=55
        it will stop
        aayega jayega nhi kyuki bola nhi tha [ use bola tha bas find krne ko only >=55 ]
        pehla value milte hi exit
         */
        System.out.println(optional);
    }
}