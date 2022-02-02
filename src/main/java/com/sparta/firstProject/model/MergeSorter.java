package com.sparta.firstProject.model;

import java.util.Arrays;

import static com.sparta.firstProject.main.Main.logger;

public class MergeSorter implements Sorter {

    @Override
    public String sort(int[] intArray){
        int arrayLength = intArray.length;

        if(arrayLength < 2){
            return null;
        }

        int midIndex = arrayLength /2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        for (int i=0; i < midIndex; i++){
            leftHalf[i] = intArray[i];
        }

        for(int i = midIndex; i<arrayLength ; i++) {
            rightHalf[i -midIndex] = intArray[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(intArray, leftHalf, rightHalf);

        logger.debug("Merge sort progressing: "+ Arrays.toString(intArray));
        return Arrays.toString(intArray);

    }

    private void merge (int[] intArray, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int l = 0, r = 0, m = 0;

        while( l< leftSize && r < rightSize){
            if(leftHalf[l] <= rightHalf[r]){
                intArray[m] = leftHalf[l];
                l++;
            }
            else{
                intArray[m] = rightHalf[r];
                r++;
            }
            m++;
        }

        while ( l< leftSize){
            intArray[m] = leftHalf[l];
            l++;
            m++;
        }
        while ( r< rightSize){
            intArray[m] = rightHalf[r];
            r++;
            m++;
        }

    }
}
