package samples;

import java.util.concurrent.*;

public class AsyncExample {

    public static void main(String[] args) {
        // Creating an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submitting a task for asynchronous execution
        Future<String> futureResult = executorService.submit(() -> {
            // Simulating a time-consuming operation
            Thread.sleep(2000);
            return "Async operation completed!";
        });

        // Perform other tasks while waiting for the asynchronous operation to complete

        try {
            // Blocking and getting the result of the asynchronous operation
            String result = futureResult.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutting down the executor service
            executorService.shutdown();
        }
    }
}
