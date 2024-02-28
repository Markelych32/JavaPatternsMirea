package practice4;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second");
        });

        executorService.execute(() -> System.out.println("First"));
        executorService.shutdown();
    }
}
