package SpringBootTutorial.AdvanceJava.MultiThreading.Employee;

public class Demo2_ParalleRunner {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started fetching");
        Demo1_Runner demo1Runner = null;
        EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
                new EmployeeRepositoryImpl3() };

        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[employeeRepositories.length];

        for (int i = 0; i < employeeRepositories.length; i++) {
            EmployeeRepository repository = employeeRepositories[i];
            threads[i] = new Thread(() -> {
                Demo1_Runner service = new Demo1_Runner(repository);
                service.run();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println(Thread.currentThread().getName() + " finished fetching");
    }
}
