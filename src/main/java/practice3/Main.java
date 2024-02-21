package practice3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static final Semaphore semaphore = new Semaphore(1);

    static volatile int buff;
    static void increment() {
        try {
            semaphore.acquire();
            buff++;
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        buff = 0;
        Thread one = new Thread(() -> {
            for (int i = 0; i < 5000; i++)
                increment();
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 5000; i++)
                increment();
        });
        one.start();
        two.start();
        Thread.sleep(1000);
        System.out.println(buff);
    }
}
