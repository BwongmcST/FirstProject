package com.sparta.firstProject;

import com.sparta.firstProject.model.BubbleSorter;
import com.sparta.firstProject.model.MergeSorter;
import com.sparta.firstProject.model.Sorter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray = {110,22,62,31,66,71,398,1,69,200,70};
        int[] testArrayBubble = Arrays.copyOf(testArray, testArray.length);
        int[] testArrayMerge = Arrays.copyOf(testArray, testArray.length);

        Sorter bubbleSorter = new BubbleSorter();
        bubbleSorter.sorter(testArrayBubble);
        System.out.println(Arrays.toString(testArrayBubble));

        Sorter mergeSorter = new MergeSorter();
        mergeSorter.sorter(testArrayMerge);


        System.out.println(Arrays.toString(testArrayMerge));


    }

}
