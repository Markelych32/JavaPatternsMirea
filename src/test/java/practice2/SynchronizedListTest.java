package practice2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice3.SynchronizedList;

import java.util.concurrent.*;

public class SynchronizedListTest {
    @Test
    void testAndRemove() throws InterruptedException {
        SynchronizedList<Integer> underTest = new SynchronizedList<>(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            try {
                underTest.add(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                underTest.remove();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        Assertions.assertEquals(0, underTest.size());
    }
}
