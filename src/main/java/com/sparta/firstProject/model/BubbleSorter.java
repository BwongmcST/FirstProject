package com.sparta.firstProject.model;

import java.util.Arrays;

import static com.sparta.firstProject.main.Main.logger;

public class BubbleSorter implements Sorter{

    @Override
    public String sort(int intArray[]){
        long bubbleSortStartTime = System.nanoTime();                               //Start Calculate execution time
        int arrayLength = intArray.length;

        for(int i = 0; i < arrayLength -1; i++){
            logger.debug("Bubble sort progressing: "+ Arrays.toString(intArray));
            for(int j = 0 ; j < arrayLength -1; j++){
                if(intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        long bubbleSortEndTime = System.nanoTime();                                 //Calculate execution time
        long bubbleSortDuration = bubbleSortEndTime - bubbleSortStartTime;          //Calculate execution time
        System.out.println("Bubble sort execution time: " + bubbleSortDuration);    //Calculate execution time
        logger.debug("Bubble sort result: "+ Arrays.toString(intArray));
        logger.debug("Bubble sort execution time: " + bubbleSortDuration);
        return Arrays.toString(intArray);

        /*
        StringBuilder tempString = new StringBuilder();
        for(int i = 0; i < intArray.length; i++){
            if(i < intArray.length - 1) {
                tempString.append(intArray[i]);
                tempString.append(", ");
            }else{
                tempString.append(intArray[i]);
            }
        }
        return tempString.toString();
*/
    }

}
