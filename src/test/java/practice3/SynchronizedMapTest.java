package practice3;

import org.junit.jupiter.api.Test;
import practice3.SynchronizedMap;

import static org.junit.jupiter.api.Assertions.*;

public class SynchronizedMapTest {
    @Test
    void testPutAndGet() {
        SynchronizedMap<String, Integer> map = new SynchronizedMap<>();

        map.put("one", 1);
        map.put("two", 2);

        assertEquals(1, map.get("one"));
        assertEquals(2, map.get("two"));
    }

    @Test
    void testContainsKey() {
        SynchronizedMap<String, Integer> map = new SynchronizedMap<>();

        map.put("one", 1);
        map.put("two", 2);

        assertTrue(map.containsKey("one"));
        assertFalse(map.containsKey("three"));
    }

    @Test
    void testContainsValue() {
        SynchronizedMap<String, Integer> map = new SynchronizedMap<>();

        map.put("one", 1);
        map.put("two", 2);

        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(3));
    }

    @Test
    void testConcurrentPutAndRemove() throws InterruptedException {
        SynchronizedMap<Integer, String> map = new SynchronizedMap<>();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Thread thread1 = new Thread(() -> map.put(finalI, "value" + finalI));
            thread1.start();
            thread1.join();
            Thread thread2 = new Thread(() -> map.remove(finalI));
            thread2.start();
        }

        Thread.sleep(1000); // Ждем секунду для завершения операций

        assertEquals(0, map.size());
    }
}
