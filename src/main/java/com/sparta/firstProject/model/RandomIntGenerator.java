package com.sparta.firstProject.model;

import java.util.concurrent.ThreadLocalRandom;

public class RandomIntGenerator {


    public int[] generateInt(int arrayLength) {

        int[] intArray = new int[arrayLength];
        int minVal = 0;
        int maxVal = 100;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();

        for(int i = 0;i < intArray.length; i++){
            intArray[i] = tlr.nextInt(minVal, maxVal);
        }
        return intArray;
    }




}