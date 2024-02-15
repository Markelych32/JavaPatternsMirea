package practice1.main;

import java.util.Comparator;

public class ArrayComparator<T> implements Comparator<T[]> {
    @Override
    public int compare(T[] arr1, T[] arr2) {
        return arr1.length - arr2.length;
    }
}