package com.sparta.firstProject.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.sparta.firstProject.main.Main.logger;

public class RandomIntGenerator {

public int[] generateInt(int arrayLength, int min, int max) {
    if(min >max){
        logger.warn("Invalid value: "+ min +" >" + max);
        return null;
    }
    //int[] intArray = new int[arrayLength];
    List<Integer> integerList = new ArrayList<>();
    int minVal = min;
    int maxVal = max;

    for(int i = minVal;i < maxVal +1; i++){
        integerList.add(i);
    }
    Collections.shuffle(integerList);
    int[] outputArray = new int[arrayLength];
    for(int i = 0; i< arrayLength;i++){
        outputArray[i] = integerList.get(i);
    }
    return outputArray;
}

// Old version (random with repeated value)
/*
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
 */







}
