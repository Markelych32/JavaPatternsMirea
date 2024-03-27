package ru.solonchev.spring.practice10.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.solonchev.spring.practice10.algo.SortingAlgorithm;

import java.util.List;

@RequiredArgsConstructor
@Component
public class AlgorithmTest {
    private final List<SortingAlgorithm> algorithmList;

    public void test() {
        for (SortingAlgorithm algorithm : algorithmList)
            algorithm.action();
    }
}
