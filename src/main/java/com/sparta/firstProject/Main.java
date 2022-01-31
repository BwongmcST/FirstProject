package com.sparta.firstProject;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray = {110,22,62,31,66,71,398,1,69,200,70};

        //BubbleSorter bubbleSorter = new BubbleSorter();
        //bubbleSorter.bubbleSort(testArray);
        //System.out.println(Arrays.toString(testArray));
        MergeSorter mergeSorter = new MergeSorter();
        mergeSorter.mergeSort(testArray);
        System.out.printf(Arrays.toString(testArray));
    }

}
