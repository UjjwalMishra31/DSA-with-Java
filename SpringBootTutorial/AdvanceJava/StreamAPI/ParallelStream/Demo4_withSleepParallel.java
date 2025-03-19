package SpringBootTutorial.AdvanceJava.StreamAPI.ParallelStream;

import java.util.List;
import java.util.stream.Stream;

public class Demo4_withSleepParallel {
    public static void main(String[] args) {
        List<EmployeeClass> employeeList = EmployeeDataClass.populateStreamEmployees();

        Stream<EmployeeClass> stream = employeeList.parallelStream();
        long start = System.currentTimeMillis();
        Stream<EmployeeClass> filteredStream = stream
                .peek(employee -> LogUtil.logWithSleep("Pre Filter  : " + employee))
                .filter(employee -> {
                    LogUtil.logWithSleep("Filtering   : " + employee);
                    return employee.getAge() >= 60;
                })
                .peek(employee -> LogUtil.logWithSleep("Post Filter : " + employee));

        LogUtil.logWithSleep("---PARALLEL STREAM---");
        LogUtil.logWithSleep("Count : " + filteredStream.count());
        System.out.println(System.currentTimeMillis() - start + " milliseconds with sleep");
    }
}
