package SpringBootTutorial.AdvanceJava.Concurrency;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
public class WebScapingCallableandFuture {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5); // 5 threads for concurrency

        List<String> urls = Arrays.asList(
                "https://www.example.com",
                "https://www.google.com",
                "https://www.wikipedia.org",
                "https://www.github.com",
                "https://www.stackoverflow.com"
        );

        List<Callable<String>> tasks = urls.stream()
                .map(url -> (Callable<String>) () -> fetchPage(url))
                .toList();

        System.out.println("Fetching pages...");
        List<Future<String>> futures = executor.invokeAll(tasks);

        for (int i = 0; i < futures.size(); i++) {
            System.out.println("\n🔹 Page from " + urls.get(i) + ":");
            System.out.println(futures.get(i).get().substring(0, 200) + "..."); // Print first 200 chars
        }

        executor.shutdown();
    }

    private static String fetchPage(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();

        return content.toString();
    }
}
