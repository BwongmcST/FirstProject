package com.sparta.firstProjectTest;

import com.sparta.firstProject.model.RandomIntGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomIntGeneratorTest {

@Test
@DisplayName("Test if minimum input > maximum input")
    public void testMinimumLargerThanMaximum(){

    RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
    int[] testOutput = randomIntGenerator.generateInt(10,10,9);
    int[] expectedOutput = null;

    Assertions.assertEquals(testOutput, expectedOutput);
}

    @Test
    @DisplayName("Test array length larger than (max-min+1)")
    public void testArrayLengthLargerThanExpected(){

        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        int[] testOutput = randomIntGenerator.generateInt(11,0,9);
        int[] expectedOutput = null;

        Assertions.assertEquals(testOutput, expectedOutput);
    }

    @Test
    @DisplayName("Test array length if = (min-max+1)")
    public void testArrayLengthIsMarginal(){

        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        int[] testOutput = randomIntGenerator.generateInt(10,0,9);
        Arrays.sort((testOutput));
        int[] expectedOutput = {0,1,2,3,4,5,6,7,8,9};

        Assertions.assertEquals(Arrays.toString(testOutput), Arrays.toString(expectedOutput));
    }


}
