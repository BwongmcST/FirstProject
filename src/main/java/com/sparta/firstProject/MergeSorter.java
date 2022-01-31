package com.sparta.firstProject;

public class MergeSorter {

    public static void mergeSort(int[] intArray){
        int arrayLength = intArray.length;

        if(arrayLength < 2){
            return;
        }

        int midIndex = arrayLength /2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        for (int i=0; i < midIndex; i++){
            leftHalf[i] = intArray[i];
        }

        for(int i = midIndex; i<arrayLength ; i++) {
            rightHalf[i -midIndex] = intArray[i - midIndex];
        }

        mergeSort(leftHalf);


        merge(intArray, leftHalf, rightHalf);
    }

    private static void merge (int[] intArray, int[] leftHalf, int[] rightHalf){
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
            intArray[m] = leftHalf[r];
            r++;
            m++;
        }


    }
}
