package com.sparta.firstproject;

public class BubbleSorter {
    public static void main(String[] args) {

        int[] testArray = {110,22,62,31,66,71,398,1,69,200,70};
        bubbleSort(testArray);
        StringBuilder arrayString = new StringBuilder();
        for(int i = 0; i < testArray.length; i++){
            arrayString.append(testArray[i]);
            arrayString.append(" ");
        }
        System.out.println(arrayString);
    }

    static void bubbleSort(int intArray[]){

        for(int i = 0; i < intArray.length -1; i++){
            for(int j = 0 ; j < intArray.length -1; j++){
                if(intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }


        }
    }


}
