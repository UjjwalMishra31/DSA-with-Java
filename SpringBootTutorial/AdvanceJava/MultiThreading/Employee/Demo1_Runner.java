package SpringBootTutorial.AdvanceJava.MultiThreading.Employee;

public class Demo1_Runner {
    private EmployeeRepository employeeRepository;

    public Demo1_Runner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started fetching from: " + employeeRepository);
        employeeRepository.displayEmployees();
        System.out.println(Thread.currentThread().getName() + " finished fetching from: " + employeeRepository);
    }
}
