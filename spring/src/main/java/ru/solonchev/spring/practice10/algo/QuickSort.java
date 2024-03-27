package ru.solonchev.spring.practice10.algo;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortingAlgorithm {
    @Override
    public void action() {
        System.out.println("Quick Sorting...");
    }
}
