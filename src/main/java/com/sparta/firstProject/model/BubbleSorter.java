package com.sparta.firstProject.model;

public class BubbleSorter implements Sorter{


    public void sort(int intArray[]){

        int arrayLength = intArray.length;

        for(int i = 0; i < arrayLength -1; i++){
            for(int j = 0 ; j < arrayLength -1; j++){
                if(intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }

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
