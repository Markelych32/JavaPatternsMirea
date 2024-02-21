package practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SynchronizedList<T> {
    private final List<T> list = new ArrayList<>();
    private final Semaphore semaphore;

    public SynchronizedList(int maxSize) {
        this.semaphore = new Semaphore(maxSize);
    }

    public void add(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            list.add(element);
        } finally {
            semaphore.release();
        }
    }

    public T remove() throws InterruptedException {
        semaphore.acquire();
        try {
            return list.remove(list.size() - 1);
        } finally {
            semaphore.release();
        }
    }

    public int size() {
        return list.size();
    }
}