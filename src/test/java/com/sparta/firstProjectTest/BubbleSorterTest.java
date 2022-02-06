package com.sparta.firstProjectTest;

import com.sparta.firstProject.model.BubbleSorter;
import com.sparta.firstProject.model.MergeSorter;
import com.sparta.firstProject.model.TreeSorter;
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
    @DisplayName("Multiple zero test // not expected to see in actual case")
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

    @Test
    @DisplayName("Negative number test")
    public void negativeNumberTest() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] testArray = {-3, -154, -433, 22, -89, -40, 64};
        int[] expectedArray = {-3, -154, -433, 22, -89, -40, 64};

        bubbleSorter.sort(testArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(testArray);
        String expected = Arrays.toString(expectedArray);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Ascending number test")
    public void ascendingNumberTest() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] testArray = {10, 11, 12, 13, 14, 15, 16};
        int[] expectedArray = {10, 11, 12, 13, 14, 15, 16};

        bubbleSorter.sort(testArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(testArray);
        String expected = Arrays.toString(expectedArray);

        Assertions.assertEquals(actual, expected);
    }



}

