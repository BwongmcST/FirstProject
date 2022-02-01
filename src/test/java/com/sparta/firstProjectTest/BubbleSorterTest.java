package com.sparta.firstProjectTest;

import com.sparta.firstProject.model.BubbleSorter;
import com.sparta.firstProject.model.MergeSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSorterTest {

    @Test
    @DisplayName("Regular input test")
    public void regularInputTest() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] testArray = {1, 61, 33, 13, 89, 0, 60};
        int[] expectedArray = {1, 61, 33, 13, 89, 0, 60};

        bubbleSorter.sort(testArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(testArray);
        String expected = Arrays.toString(expectedArray);

        Assertions.assertEquals(actual, expected);
    }
    @Test
    @DisplayName("Multiple zero test")
    public void multipleZeroTest() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] testArray = {0, 0, 11, 0, 0, 0, 2};
        int[] expectedArray = {0, 0, 11, 0, 0, 0, 2};

        bubbleSorter.sort(testArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(testArray);
        String expected = Arrays.toString(expectedArray);

        Assertions.assertEquals(actual, expected);
    }
}

