package practice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayComparatorTest {

    @Test
    public void FirstSmallerArrayShouldReturnNegativeValue() {
        ArrayComparator<String> comparator = new ArrayComparator<>();
        String[] stringArray1 = {"Hello", "world"};
        String[] stringArray2 = {"Hello", "world", "!"};

        int actualResponse = comparator.compare(stringArray1, stringArray2);
        int expectedResponse = -1;

        Assertions.assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void SecondSmallerArrayShouldReturnPositiveValue() {
        ArrayComparator<String> comparator = new ArrayComparator<>();
        String[] stringArray1 = {"Hello", "world", "!"};
        String[] stringArray2 = {"Hello", "world"};

        int actualResponse = comparator.compare(stringArray1, stringArray2);
        int expectedResponse = 1;

        Assertions.assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void ArraysWithSameLengthShouldReturnZero() {
        ArrayComparator<String> comparator = new ArrayComparator<>();
        String[] stringArray1 = {"Hello", "world", "!"};
        String[] stringArray2 = {"Hello", "world", "!"};

        int actualResponse = comparator.compare(stringArray1, stringArray2);
        int expectedResponse = 0;

        Assertions.assertEquals(actualResponse, expectedResponse);
    }


}
