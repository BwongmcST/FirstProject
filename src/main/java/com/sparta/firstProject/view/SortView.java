package com.sparta.firstProject.view;

import com.sparta.firstProject.model.RandomIntGenerator;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;

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
         System.out.println("Please input minimum value: ");

         try{inputMin = scanner.nextInt();
                logger.debug("Received minimum value: "+ inputMin);}
            catch(InputMismatchException me) {
                //me.printStackTrace();
                scanner.next();
                logger.warn("Incorrect input detected: Non-int value");
                isValidInput = false;
            }
        }while (!isValidInput);

        logger.debug("Valid minimum value: "+ inputMin);

        do {
            isValidInput = true;
            System.out.println("Please input maximum value: ");
            try{inputMax = scanner.nextInt();
                logger.debug("Received maximum value: "+ inputMax);}
            catch(InputMismatchException me) {
                //me.printStackTrace();
                scanner.next();
                logger.warn("Incorrect input detected: Non-int value");
                isValidInput = false;
            }
         }while (!isValidInput || inputMin >= inputMax);

        logger.debug("Valid maximum value: "+ inputMax);


        do {
            isValidInput = true;
            System.out.println("Please input array length: ");
            try {inputLength = scanner.nextInt();
                logger.debug("Received array length: "+ inputLength);}
            catch(InputMismatchException me) {
                //me.printStackTrace();
                scanner.next();
                logger.warn("Incorrect input detected: Non-int value");
                isValidInput = false;
            }
        }while (!isValidInput || inputLength > (inputMax-inputMin));

        logger.debug("Valid array length: "+ inputLength);

        System.out.println("Integer array generated: ");
        int[] intArray = randomIntGenerator.generateInt(inputLength,inputMin,inputMax);
        System.out.println(Arrays.toString(intArray));
        logger.debug("Array generated: "+ Arrays.toString(intArray));
        return intArray;
    }

    public String getSortMethod(){
        boolean isValidInput = true;
        String sortMethod;

        List<String> validMethodList = new ArrayList<>();
        validMethodList.add("merge");
        validMethodList.add("bubble");
        validMethodList.add("tree");

        do {
            isValidInput = true;
            System.out.println("Please enter sort method (bubble/merge/tree): ");
            Scanner scanner = new Scanner(System.in);
            sortMethod = scanner.next();
            if(!validMethodList.contains(sortMethod)){
                isValidInput = false;
            }
            logger.debug("Input sortMethod: " + sortMethod);
        }while (!isValidInput);

        logger.debug("Valid sort method: "+ sortMethod);
        return sortMethod;
    }

    public void displaySortResult(String result){
        logger.debug("Final sort result: "+ result);
        System.out.println(result);
    }

}
