package SpringBootTutorial.AdvanceJava.StreamAPI.ParallelStream;

import java.util.List;
import java.util.stream.Stream;

public class Demo3_withSleep
{
    public static void main(String[] args) {
        List<EmployeeClass> employeeList = EmployeeDataClass.populateStreamEmployees();
        // Create a stream from given list
        // Filter employees by marks more than equal to 60
        // Print the number of filtered employees
        // Print employee before filtering, during filtering and after filtering using LogUtil.logWithSleep()
        Stream<EmployeeClass> stream = employeeList.stream();
        long start = System.currentTimeMillis();
        Stream<EmployeeClass> filteredStream = stream
                .peek(employee -> LogUtil.logWithSleep("Pre Filter  : " + employee))
                .filter(employee -> {
                    LogUtil.logWithSleep("Filtering   : " + employee);
                    return employee.getAge() >= 60;
                })
                .peek(employee -> LogUtil.logWithSleep("Post Filter : " + employee));

        LogUtil.logWithSleep("---STREAM---");
        LogUtil.logWithSleep("Count : " + filteredStream.count());
        System.out.println(System.currentTimeMillis() - start + " milliseconds with sleep");
    }
}
