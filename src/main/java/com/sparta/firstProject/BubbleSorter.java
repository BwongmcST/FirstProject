package com.sparta.firstProject;

public class BubbleSorter {


    public String bubbleSort(int intArray[]){

        for(int i = 0; i < intArray.length -1; i++){
            for(int j = 0 ; j < intArray.length -1; j++){
                if(intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }

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

    }

}
