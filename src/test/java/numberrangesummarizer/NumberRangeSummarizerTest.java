package numberrangesummarizer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class NumberRangeSummarizerTest {

    @Test
    @DisplayName("Test collect() method")
    void testCollect() {
        NumberRangeSummarizerMain object = new NumberRangeSummarizerMain();
        String test = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        Collection<Integer> numbers = object.collect(test);
    }

    @Test
    @DisplayName("Test summarizeCollection() method")
    void testSummarizeCollection() {
        NumberRangeSummarizerMain object = new NumberRangeSummarizerMain();
        Collection<Integer> myList = new ArrayList<>();
        int numbers[] = {1,3,6,7,8,12,13,14,15,21,22,23,24,31};
        for (int i: numbers) {
            myList.add(i);
        }
        Assertions.assertEquals("1, 3, 6-8, 12-15, 21-24, 31", object.summarizeCollection(myList));
    }
}
