package SpringBootTutorial.AdvanceJava.MultiThreading.Example2;

import SpringBootTutorial.AdvanceJava.MultiThreading.Employee.EmployeeRepository;

public class EmployeeServiceImpl extends Thread {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName() + " started fetching from : " + employeeRepository);
            employeeRepository.displayEmployees();
            System.out.println(Thread.currentThread().getName() + " finished fetching from : " + employeeRepository);
    }
}
