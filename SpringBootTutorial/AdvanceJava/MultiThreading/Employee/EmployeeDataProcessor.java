package SpringBootTutorial.AdvanceJava.MultiThreading.Employee;

public class EmployeeDataProcessor {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started fetching");
        long startTime = System.currentTimeMillis();

        Demo1_Runner demo1Runner = null;
        EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
                new EmployeeRepositoryImpl3() };

        for (EmployeeRepository employeeRepository : employeeRepositories) {
            demo1Runner = new Demo1_Runner(employeeRepository);
            demo1Runner.run();
        }

        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println(Thread.currentThread().getName() + " finished fetching");
    }
}
