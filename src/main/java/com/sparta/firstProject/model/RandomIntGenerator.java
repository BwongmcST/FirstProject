package com.sparta.firstProject.model;

import java.util.concurrent.ThreadLocalRandom;

public class RandomIntGenerator {


    public int[] generateInt(int arrayLength, int min, int max) {

        int[] intArray = new int[arrayLength];
        int minVal = min;
        int maxVal = max;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();

        for(int i = 0;i < intArray.length; i++){
            intArray[i] = tlr.nextInt(minVal, maxVal);
        }
        return intArray;
    }




}
