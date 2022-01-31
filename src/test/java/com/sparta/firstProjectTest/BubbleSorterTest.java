package com.sparta.firstProjectTest;

import com.sparta.firstProject.BubbleSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BubbleSorterTest {

    private BubbleSorter bubbleSorter;
    @BeforeEach

    void setUp(){ bubbleSorter = new BubbleSorter();}

    @ParameterizedTest
    @DisplayName("Use Bubble Sort to sort all the interger in an array")
    public void UseBubbleSortTotSortAllIntergerInArray(int[] intArray, String expected){
        Assertions.assertEquals(expected,bubbleSorter.bubbleSort(intArray));
    }
}
