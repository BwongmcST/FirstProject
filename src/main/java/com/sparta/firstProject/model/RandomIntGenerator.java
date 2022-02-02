package com.sparta.firstProject.model;

import java.util.concurrent.ThreadLocalRandom;

import static com.sparta.firstProject.Main.logger;

public class RandomIntGenerator {


    public int[] generateInt(int arrayLength, int min, int max) {
        if(min >max){
            logger.warn("Invalid value: "+ min +" >" + max);
            return null;
        }
        int[] intArray = new int[arrayLength];
        int minVal = min;
        int maxVal = max + 1;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();

        for(int i = 0;i < intArray.length; i++){
            intArray[i] = tlr.nextInt(minVal, maxVal);
        }
        return intArray;
    }




}
