package com.sparta.firstProjectTest;

import com.sparta.firstProject.BubbleSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

public class BubbleSorterTest {

    @Test
    public void testBubbleSorter(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] testArray = {1,61,33,13,89,0,60};
        bubbleSorter.bubbleSort(testArray);

        String actual = Arrays.toString(testArray);
        String expected = "[0, 1, 13, 33, 60, 61, 89]";
        Assertions.assertEquals(actual,expected);
    }
}
