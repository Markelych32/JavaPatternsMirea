package practice3;

import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap<K, V> {
    private final Map<K, V> map = new HashMap<>();

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }
    public synchronized V remove(K key) {
        return map.remove(key);
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized boolean containsKey(K key) {
        return map.containsKey(key);
    }
    public synchronized int size() {
        return map.size();
    }

    public synchronized boolean containsValue(V value) {
        return map.containsValue(value);
    }
}
