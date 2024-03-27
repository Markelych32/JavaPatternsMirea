package ru.solonchev.spring.practice10.algo;

import org.springframework.stereotype.Component;

@Component
public class InsertionSort implements SortingAlgorithm {
    @Override
    public void action() {
        System.out.println("Insertion Sorting...");
    }
}
