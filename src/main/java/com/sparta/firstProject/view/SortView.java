package com.sparta.firstProject.view;

import com.sparta.firstProject.model.RandomIntGenerator;

import java.util.Arrays;
import java.util.Scanner;

import static com.sparta.firstProject.Main.logger;

public class SortView {

    public int[] getIntArray(){
        int inputMin;
        int inputMax;
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input minimum value: ");
        inputMin = scanner.nextInt();
        logger.debug("Input minimum value: "+ inputMin);

        do {
            System.out.printf("Please input maximum value: ");
            inputMax = scanner.nextInt();
            logger.debug("Input maximum value: "+ inputMax);
        }while (inputMin >= inputMax);

        System.out.printf("Please input array length: ");
        int inputLength = scanner.nextInt();
        logger.debug("Input array length: "+ inputLength);
        System.out.printf("Integer array generated: ");
        int[] intArray = randomIntGenerator.generateInt(inputLength,inputMin,inputMax);
        System.out.println(Arrays.toString(intArray));
        logger.debug("Array generated: "+ Arrays.toString(intArray));
        return intArray;
    }

    public String getSortMethod(){
        System.out.printf("Please enter sort method (bubble/merge): ");
        Scanner scanner = new Scanner(System.in);
        String sortMethod = scanner.next();
        logger.debug("Input sortMethod: "+ sortMethod);
        return sortMethod;
    }

    public void displaySortResult(String result){
        logger.debug("Final sort result: "+ result);
        System.out.println(result);
    }
}
