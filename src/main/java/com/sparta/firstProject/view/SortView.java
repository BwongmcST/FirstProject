package com.sparta.firstProject.view;

import com.sparta.firstProject.model.RandomIntGenerator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sparta.firstProject.main.Main.logger;

public class SortView {

    public int[] getIntArray(){
        int inputMin = 0;
        int inputMax = 0;
        int inputLength = 0;
        boolean isValidInput = true;

        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        Scanner scanner = new Scanner(System.in);

        do{
         isValidInput = true;
         System.out.printf("Please input minimum value: ");

         try{inputMin = scanner.nextInt();}
            catch(InputMismatchException me) {
                me.printStackTrace();
                scanner.next();
                logger.warn("Incorrect input detected: Non-int value");
                isValidInput = false;
            }
        }while (!isValidInput);

        logger.debug("Input minimum value: "+ inputMin);

        do {
            isValidInput = true;
            System.out.printf("Please input maximum value: ");
            try{inputMax = scanner.nextInt();}
            catch(InputMismatchException me) {
                me.printStackTrace();
                scanner.next();
                logger.warn("Incorrect input detected: Non-int value / minInt > maxInt");
                isValidInput = false;
            }
         }while (!isValidInput || inputMin >= inputMax);

        logger.debug("Input maximum value: "+ inputMax);


        do {
            isValidInput = true;
            System.out.printf("Please input array length: ");
            try {inputLength = scanner.nextInt();}
            catch(InputMismatchException me) {
                me.printStackTrace();
                scanner.next();
                logger.warn("Incorrect input detected: Non-int value");
                isValidInput = false;
            }
        }while (!isValidInput);

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
