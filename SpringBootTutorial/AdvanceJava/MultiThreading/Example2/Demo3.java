package SpringBootTutorial.AdvanceJava.MultiThreading.Example2;

import SpringBootTutorial.AdvanceJava.MultiThreading.Employee.EmployeeRepository;
import SpringBootTutorial.AdvanceJava.MultiThreading.Employee.EmployeeRepositoryImpl1;
import SpringBootTutorial.AdvanceJava.MultiThreading.Employee.EmployeeRepositoryImpl2;
import SpringBootTutorial.AdvanceJava.MultiThreading.Employee.EmployeeRepositoryImpl3;


public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started fetching");
        EmployeeServiceImpl employeeServiceImpl = null;
        EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
                new EmployeeRepositoryImpl3() };
        Thread[] employeeServices = new Thread[employeeRepositories.length];

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < employeeRepositories.length; i++) {
            employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
            employeeServices[i] = employeeServiceImpl;
            employeeServices[i].start();
        }

        for (int i = 0; i < employeeServices.length; i++) {
            try {
                employeeServices[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println(Thread.currentThread().getName() + " finished fetching");
    }
}
