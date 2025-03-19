package SpringBootTutorial.AdvanceJava.StreamAPI.ParallelStream;

import java.util.List;
import java.util.stream.Stream;

public class Demo2_withoutSleepParallel {
    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeDataClass.populateStreamEmployees();

        Stream<EmployeeClass> stream = employeeList.parallelStream();
        long start = System.currentTimeMillis();
        Stream<EmployeeClass> filteredStream = stream
                .peek(employee -> LogUtil.logWithoutSleep("Pre Filter  : " + employee))
                .filter(employee -> {
                    LogUtil.logWithoutSleep("Filtering   : " + employee);
                    return employee.getAge() >= 60;
                })
                .peek(employee -> LogUtil.logWithoutSleep("Post Filter : " + employee));

        LogUtil.logWithoutSleep("---PARALLEL STREAM---");
        LogUtil.logWithoutSleep("Count : " + filteredStream.count());
        System.out.println(System.currentTimeMillis() - start + " milliseconds without sleep");
    }
}
