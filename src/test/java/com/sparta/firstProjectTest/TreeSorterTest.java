package com.sparta.firstProjectTest;

import com.sparta.firstProject.model.BubbleSorter;
import com.sparta.firstProject.model.TreeSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TreeSorterTest {

    @Test
    @DisplayName("Regular input test")
    public void regularInputTest() {
        TreeSorter treeSorter = new TreeSorter();
        int[] testArray = {1, 61, 33, 13, 89, 0, 60};
        int[] expectedArray = {1, 61, 33, 13, 89, 0, 60};

        treeSorter.sort(testArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(testArray);
        String expected = Arrays.toString(expectedArray);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Negative number test")
    public void negativeNumberTest() {
        TreeSorter treeSorter = new TreeSorter();
        int[] testArray = {-3, -154, -433, 22, -89, -40, 64};
        int[] expectedArray = {-3, -154, -433, 22, -89, -40, 64};

        treeSorter.sort(testArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(testArray);
        String expected = Arrays.toString(expectedArray);

        Assertions.assertEquals(actual, expected);
    }


}
