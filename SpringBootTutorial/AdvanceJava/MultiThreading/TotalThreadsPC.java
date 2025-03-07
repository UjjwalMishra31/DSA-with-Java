package SpringBootTutorial.AdvanceJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TotalThreadsPC {
    public static void main(String[] args) {
        int count = 0;
//        while (true) {
//            new Thread(() -> {
//                try {
//                    Thread.sleep(Long.MAX_VALUE);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }).start();
//            count++;
//            System.out.println("Threads created: " + count);
//        }
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU cores: " + processors);
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        for (int i = 0; i < 10; i++) {
            executor.submit(() -> System.out.println("Running thread: " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }
}