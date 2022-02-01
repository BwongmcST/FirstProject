package com.sparta.firstProjectTest;

import com.sparta.firstProject.model.BubbleSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSorterTest {

    @Test
        public void testBubbleSorter(){
            BubbleSorter bubbleSorter = new BubbleSorter();
            int[] testArray = {1,61,33,13,89,0,60};
            bubbleSorter.sorter(testArray);

            String actual = Arrays.toString(testArray);
            String expected = "[0, 1, 13, 33, 60, 61, 89]";
            Assertions.assertEquals(actual,expected);
    }
}
